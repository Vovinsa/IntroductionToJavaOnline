import java.util.ArrayList;

public class Country {

    private final String name;
    private final City capital;
    private final ArrayList<Region> regions = new ArrayList<>();
    private int area = 0;

    public Country(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public void add(Region region) {
        regions.add(region);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getCapital() {
        return capital.getName();
    }

    public int area() {
        for (Region region : regions) {
            area += region.getArea();
        }

        return area;
    }

}
