package model;

public class EBook extends Book {

    private String site;

    public EBook(int id, String name, String author, int year, String site) {
        super(id, name, author, year);

        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "model.EBook{" +
                "site='" + site + '\'' +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year='" + getYear() + '\'' +
                '}';
    }
}
