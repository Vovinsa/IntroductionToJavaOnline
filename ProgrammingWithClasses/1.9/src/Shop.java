import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Book> books;

    public Shop() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void filterByAuthor(String author) {
        books.stream().filter(x -> x.getAuthor().equals(author)).forEach(System.out::println);
    }

    public void filterByPublishingHouse(String publishingHouse) {
        books.stream().filter(x -> x.getPublishingHouse().equals(publishingHouse)).forEach(System.out::println);
    }

    public void filterByYearOfPublishing(int year) {
        books.stream().filter(x -> x.getYearOfPublishing() > year).forEach(System.out::println);
    }

}
