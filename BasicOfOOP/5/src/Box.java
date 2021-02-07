import sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Box {

    enum BoxType {
        BIG(2),
        MEDIUM(1.5),
        SMALL(1);

        private final double maxWeight;

        BoxType(double size) {
            this.maxWeight = size;
        }
    }

    private final List<Sweets> sweets;
    private final BoxType boxType;
    private int weight;

    public Box(BoxType boxType) {
        sweets = new ArrayList<>();
        this.boxType = boxType;
        weight = 0;
    }

    public void addSweet(Sweets sweet) {
        sweets.add(sweet);

        for (Sweets sw: sweets) {
            weight += sw.getWeight();
        }

        if (weight > boxType.maxWeight) {
            sweets.remove(sweet);
            System.out.println("The box is full");
        } else if (weight == boxType.maxWeight) {
            System.out.println("You filled the box");
        } else {
            System.out.println("You added: " + sweet.getName() + "\nThe weight can be added: " + (boxType.maxWeight - weight));
        }
    }

    public boolean check() {
        return weight < boxType.maxWeight;
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public double getBoxSize() {
        return boxType.maxWeight;
    }

}

