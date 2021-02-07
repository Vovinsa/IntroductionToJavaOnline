package sweets;

public class Chocolate implements Sweets {

    private final String name = "Chocolate";
    private final double weight = 0.2;
    private final double cost = 2;
    private final int count;

    public Chocolate(int count) {
        this.count = count;
    }

    public double getWeight() {
        return weight * count;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost * count;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }

}
