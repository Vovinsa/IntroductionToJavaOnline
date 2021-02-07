public class Region {

    private final City city;
    private final String name;
    private final int area;

    public Region(City city, int area) {
        this.city = city;
        name = city.getName() + " region";
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public int getArea() {
        return area;
    }
}
