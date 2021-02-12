public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Book("Aaaaa", "B", "C", 45, 5, Book.BindingType.SOFT, 2004));
        shop.add(new Book("Bbbbb", "B", "C", 45, 5, Book.BindingType.SOFT, 1998));
        shop.add(new Book("Ccccc", "B", "C", 45, 5, Book.BindingType.SOLID, 1899));
        shop.add(new Book("Ddddd", "C", "B", 45, 5, Book.BindingType.SOFT, 2005));
        shop.add(new Book("Eeeee", "C", "B", 45, 5, Book.BindingType.SOLID, 1788));
        shop.add(new Book("Fffff", "C", "B", 45, 5, Book.BindingType.SOFT, 1988));
        shop.add(new Book("Ggggg", "D", "A", 45, 5, Book.BindingType.SOLID, 2004));
        shop.add(new Book("Hhhhh", "D", "A", 45, 5, Book.BindingType.SOFT, 1999));
        shop.add(new Book("Iiiii", "I", "A", 45, 5, Book.BindingType.SOFT, 2000));
        shop.add(new Book("Jjjjj", "U", "S", 45, 5, Book.BindingType.SOLID, 1878));

        shop.filterByAuthor("C");

        System.out.println("\n\n\n");

        shop.filterByPublishingHouse("A");

        System.out.println("\n\n\n");

        shop.filterByYearOfPublishing(1900);

    }
}
