public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.addProduct("milk", 2);
        payment.addProduct("bread", 4);

        payment.showProducts();

    }
}
