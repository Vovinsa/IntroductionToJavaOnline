import java.util.ArrayList;
import java.util.List;

public class Payment {

    List<Product> products = new ArrayList<>();

    public void addProduct(String name, int price) {
        products.add(new Product(name, price));
    }

    public void showProducts() {
        products.forEach(System.out::println);
    }

    private class Product {

        private final String name;
        private final int price;

        public  Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
