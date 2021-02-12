public class Book {

    public enum BindingType {
        SOFT,
        SOLID
    }

    private int id = 0;
    private String name;
    private String author;
    private String publishingHouse;
    private int numberOfPages;
    private int price;
    private int yearOfPublishing;
    private BindingType type;

    public Book(String name, String author, String publishingHouse, int numberOfPages, int price, BindingType type, int yearOfPublishing) {
        id++;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.type = type;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BindingType getType() {
        return type;
    }

    public void setType(BindingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", yearOfPublishing=" + yearOfPublishing +
                ", type=" + type +
                '}';
    }
}
