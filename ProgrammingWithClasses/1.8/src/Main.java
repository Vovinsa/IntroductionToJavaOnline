public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Customer("Vova", "Ivanov", "Pavlovich", "Rafieva", 439867));
        shop.add(new Customer("Pasha", "Pashkov", "Pavlovich", "Rafieva", 189389));
        shop.add(new Customer("Makar", "Ivanov", "Makarovich", "Rafieva", 891989));

        shop.sortByName(shop.getCustomers());
        shop.filterByCard(500000, 900000);

    }
}
