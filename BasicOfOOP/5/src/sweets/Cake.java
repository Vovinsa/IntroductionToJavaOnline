package sweets;

public class Cake implements Sweets {

    private final String name = "Cake";
    private final double weight = 1;
    private final double cost = 3;
    private final int count;

    public Cake(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight * count;
    }

    public double getCost() {
        return cost * count;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }

}
