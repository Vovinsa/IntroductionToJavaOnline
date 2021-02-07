import model.Book;
import model.EBook;
import model.User;
import utils.BookUtil;
import utils.UserUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        UserUtil userUtil = new UserUtil();
        BookUtil bookUtil = new BookUtil();
        boolean logged = false;
        User user = null;
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (!logged) {
            System.out.println("1. Register new user");
            System.out.println("2. Register new admin");
            System.out.println("3. Login");
            int choice = scanner.nextInt();

            if (choice == 1) {

                User newUser = getUser(false);

                if (!userUtil.checkLogin(newUser.getLogin())) {
                    System.out.println("This username is used by another user");
                    System.out.println("Registration cancelled");
                } else {
                    userUtil.addUser(newUser);
                }

            } else if (choice == 2) {
                System.out.println("Enter password: ");
                String password = bufferedReader.readLine();
                System.out.println("Enter login: ");
                if (userUtil.login(password)) {
                    System.out.println("OK\n");

                    User newUser = getUser(true);

                    if (!userUtil.checkLogin(newUser.getLogin())) {
                        System.out.println("This username is used by another user");
                        System.out.println("Registration cancelled");
                    } else {
                        userUtil.addUser(newUser);
                    }
                }
            } else {
                System.out.println("Enter login: ");
                String login = bufferedReader.readLine();
                System.out.println("Enter password: ");
                String password = bufferedReader.readLine();
                user = userUtil.login(login, password);
                if (user == null) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Ok, logged");
                    logged = true;
                }
            }

            System.out.println("Press enter to continue...");
            bufferedReader.readLine();
        }

        boolean exit = false;

        if (user.isAdmin()) {
            bookMenuAdmin(exit, bookUtil);
        } else {
            bookMenuUser(exit, bookUtil);
        }
        user.logout();

        userUtil.saveFile();
        bookUtil.saveFile();

    }

    public static User getUser(boolean admin) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter email: ");
        String email = bufferedReader.readLine();
        System.out.println("Enter login: ");
        String login = bufferedReader.readLine();
        System.out.println("Enter password: ");
        String password = bufferedReader.readLine();

        return new User(email, login, password, admin);

    }

    public static void bookMenuAdmin(boolean exit, BookUtil books) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Add new book");
            System.out.println("4. Remove book");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                findBook(books);
            } else if (choice == 2) {
                printBooks(books.filterByTitle(""));
            } else if (choice == 3) {
                addBook(books);
            } else if (choice == 4) {
                removeBook(books);
            } else if (choice == 5) {
                exit = true;
            }
        }
    }

    public static void findBook(BookUtil books) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Search by id");
        System.out.println("2. Search by title");
        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            System.out.print("Enter id:");
            int id = scanner.nextInt();
            Book book = books.findBookById(id);
            System.out.println(book == null ? "Book is not found" : book);

        } else if (choice2 == 2) {
            System.out.print("Enter title:");
            String title = bufferedReader.readLine();
            List<Book> filtered = books.filterByTitle(title);
            printBooks(filtered);
        }
    }

    public static void printBooks(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (true) {
            for (int i = index; i < Integer.min(books.size(), index + 4); i++) {
                System.out.println(books.get(i));
            }

            System.out.println("1 - next page, 2 - previous page, 3 - exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                index += 4;
                if (index >= books.size()) {
                    index -= 4;
                }
            } else if (choice == 2) {
                index = Integer.max(0, index - 4);
            } else {
                return;
            }
        }
    }

    public static void bookMenuUser(boolean exit, BookUtil books) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Find book");
            System.out.println("2. Show all books");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                findBook(books);
            } else if (choice == 2) {
                printBooks(books.filterByYear(Integer.MIN_VALUE, Integer.MAX_VALUE));
            } else if (choice == 3) {
                exit = true;
            }
        }
    }

    public static void addBook(BookUtil books) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding new book...");
        System.out.print("Name: ");
        String name = bufferedReader.readLine();
        System.out.print("Author: ");
        String author = bufferedReader.readLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.readLine();

        Book book;
        System.out.println("Is it e-book? (1 - yes, 2 - no)");
        int choice3 = scanner.nextInt();
        if (choice3 == 1) {
            System.out.println("Enter web location of this book (URL, website, etc.)");
            String site = bufferedReader.readLine();
            book = new EBook(0, name, author, year, site);
        } else {
            book = new Book(0, name, author, year);
        }

        books.addBook(book);
    }

    public static void removeBook(BookUtil books) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book id: ");
        int id = scanner.nextInt();
        if (books.removeBook(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("Error: book is not found");
        }
    }

}
