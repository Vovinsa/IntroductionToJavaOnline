public class BankAccount {

    protected enum AccountType {
        MAIN, ADDITIONAL, OVERDRAFT
    }

    private double balance;
    private boolean bloc = true;
    private final AccountType accountType;

    public BankAccount(AccountType accountType) {
        this(0, accountType);
    }

    public BankAccount(double balance, AccountType accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double money) {
        if (bloc) {
            balance += money;
            System.out.println("Add " + money + ", on account of " + balance);
        } else {
            System.out.println("Account is blocked");
        }

    }

    public void withdraw(double money) {
        if (bloc) {
            balance -= money;
            System.out.println("Spend " + money + ", on account of " + balance);
        } else {
            System.out.println("Account is blocked");
        }

    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBloc() {
        return bloc;
    }

    public void setBloc(boolean bloc) {
        this.bloc = bloc;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", bloc=" + bloc +
                ", accountType=" + accountType +
                '}';
    }

}
