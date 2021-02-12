public class Customer {

    private int id = 0;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int cardNumber;
    private long bankAccountNumber;

    public Customer(String name, String surname, String patronymic, String address, int cardNumber) {
        id++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        bankAccountNumber = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

}

