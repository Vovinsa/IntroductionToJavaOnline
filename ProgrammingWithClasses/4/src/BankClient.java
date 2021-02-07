import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BankClient {

    private final List<BankAccount> bankAccounts = new ArrayList<>();
    private final String clientName;

    public BankClient(String clientName, BankAccount bankAccount) {
        this.clientName = clientName;
        this.bankAccounts.add(bankAccount);
    }

    public BankClient(String clientName, BankAccount... bankAccount) {
        this.clientName = clientName;
        this.bankAccounts.addAll(Arrays.asList(bankAccount));
    }

    public void showBalance(BankAccount.AccountType accountType) {
        for (BankAccount ba : bankAccounts) {
            if (ba.getAccountType().equals(accountType)) {
                System.out.println("On this account: " + ba.getAccountType() + " balance = " + ba.getBalance());
            }
        }
    }

    public void showBalance() {
        for (BankAccount ba : bankAccounts) {
            System.out.println("On this account: " + ba.getAccountType() + " balance = " + ba.getBalance());
        }
    }

    public void sortAccount(){
        bankAccounts.stream().sorted(Comparator.comparingInt(x -> (int) x.getBalance())).forEach(System.out::println);
    }

    public void amountPositiveAccounts(){
        double newBalance = 0;
        for (BankAccount ba : bankAccounts) {
            if (ba.getBalance() > 0){
                newBalance += ba.getBalance();
            }
        }
        System.out.println("Amount of positive accounts = " + newBalance);
    }

    public void amountAllAccounts(){
        double newBalance = 0;
        for (BankAccount ba : bankAccounts) {
            newBalance += ba.getBalance();
        }
        System.out.println("Amount of all accounts = " + newBalance);
    }

    public void blocAccount(BankAccount.AccountType accountType, boolean isBloc){
        for (BankAccount ba : bankAccounts) {
            if (ba.getAccountType().equals(accountType)) {
                ba.setBloc(isBloc);
                if (isBloc){
                    System.out.println("This account: " + ba.getAccountType() + " blocked ");
                }else {
                    System.out.println("This account: " + ba.getAccountType() + " unlocked ");
                }

            }
        }
    }

    public String getClientName() {
        return clientName;
    }
}
