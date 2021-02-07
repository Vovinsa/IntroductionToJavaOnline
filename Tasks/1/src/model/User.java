package model;

public class User {

    private String email;
    private String login;
    private String password;
    private boolean isAdmin;
    private boolean isLogged;

    public User(String email, String login, String password, boolean isAdmin) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            isLogged = true;
        }
        return isLogged;
    }

    public void logout() {
        isLogged = false;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "model.User{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isLogged=" + isLogged +
                '}';
    }
}
