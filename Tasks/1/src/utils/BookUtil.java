package utils;

import model.Book;
import model.EBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookUtil {

    public BookUtil () {
        bookUtil();
    }

    private List<Book> books;
    private File file;
    private int bookId;

    private void bookUtil() {
        books = new ArrayList<>();
        file = new File("books.txt");

        if (file.exists() && file.canRead()) {
            try (Scanner scanner = new Scanner(new FileReader(file))) {
                while (scanner.hasNextLine()) {
                    String bookType = scanner.nextLine();
                    String name = scanner.nextLine();
                    String author = scanner.nextLine();
                    int year = Integer.parseInt(scanner.nextLine());
                    if (bookType.equals("e")) {
                        String site = scanner.nextLine();
                        EBook eBook = new EBook(0, name, author, year, site);
                        addBook(eBook);
                    } else {
                        Book book = new Book(0, name, author, year);
                        addBook(book);
                    }
                    scanner.nextLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void addBook(Book book) {
        book.setId(bookId++);
        books.add(book);
    }

    public Book findBookById (int id) {
        for (Book book : books) {
            if (bookId == id) {
               return book;
            }
        }
        return null;
    }

    public void saveFile () {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)) {
            try (PrintWriter out = new PrintWriter(file)) {
                for (Book book: books) {
                    out.println(book instanceof EBook ? "e" : "p");
                    out.println(book.getName());
                    out.println(book.getAuthor());
                    out.println(book.getYear());
                    if (book instanceof EBook) {
                        out.println(((EBook) book).getSite());
                    }
                    out.println();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error");
        }
    }

    public List<Book> filterByTitle(String title) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getName().toLowerCase().equals(title.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }

    public boolean removeBook (int id) {
        return books.remove(findBookById(id));
    }

    public List<Book> filterByYear(int filterStart, int filterFinish) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (filterStart <= book.getYear() && book.getYear() <= filterFinish) {
                filteredBooks.add(book);
            }
        }

        return (filteredBooks.size() > 0 ? filteredBooks : null);
    }


}
