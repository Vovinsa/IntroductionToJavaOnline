package utils;

import model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserUtil {

    private List<User> users;
    private File file;

    public UserUtil () {
        userUtil();
    }

    private void userUtil () {
        users = new ArrayList<>();
        file = new File("users.txt");

        if (file.exists() && file.canRead()) {
            try (Scanner scanner = new Scanner(new FileReader(file))) {
                while (scanner.hasNextLine()) {
                    String email = scanner.nextLine();
                    String login = scanner.nextLine();
                    String password = scanner.nextLine();
                    String admin = scanner.nextLine();
                    boolean isAdmin = false;
                    if (admin.equals("a")) {
                        isAdmin = true;
                    }
                    User user = new User(email, login, password, isAdmin);
                    users.add(user);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveFile () {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)) {
            try (PrintWriter out = new PrintWriter(file)) {
                for (User user : users) {
                    out.print(user.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public User login (String login, String password) {
        for (User user : users) {
            if (user.login(login, password)) {
                return user;
            }
        }
        return null;
    }

    public boolean login (String password) {
        return true;
    }

    public boolean checkLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return false;
            }
        }
        return true;
    }

    public boolean addUser(User newUser) {
        for (User user : users) {
            if (user.getLogin().equals(newUser.getLogin())) {
                return false;
            }
        }
        users.add(newUser);
        return true;
    }

}
