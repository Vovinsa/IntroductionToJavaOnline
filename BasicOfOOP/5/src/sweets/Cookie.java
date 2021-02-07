package sweets;

public class Cookie implements Sweets {

    private final String name = "Cookie";
    private final double weight = 0.1;
    private final double cost = 1;
    private final int count;

    public Cookie(int count) {
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
        return "Cookie{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }

}
