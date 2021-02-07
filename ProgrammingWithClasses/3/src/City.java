import java.util.ArrayList;

public class City {

    private final ArrayList<District> districts = new ArrayList<>();
    private final String name;

    public City(String name) {
        this.name = name;
    }

    public void add(District district) {
        districts.add(district);
    }

    public String getName() {
        return name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }
}
