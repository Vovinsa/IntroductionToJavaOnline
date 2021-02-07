package dragons;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Treasures {

    private final int COUNT = 100;
    private final int[] treasures = new int[COUNT];

    public void genTreasures () {
        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = (int) (Math.random() * 100);
        }
    }

    public void theMostExpensive () {
        OptionalInt max = Arrays.stream(treasures).max();
        int index = Collections.emptyList().indexOf(max);

        System.out.println("Самое дорогое сокровище находится по индексом "
                + index
                + " и имеет цену в "
                + max
                + " монет");
    }

    public void printTreasures () {
        System.out.println(Arrays.toString(treasures));
    }

    public void printTreasureByCost (int cost) {
        int index = Collections.emptyList().indexOf(cost);
        System.out.println("Сокровище с ценой "
                + cost
                + " монет находится под индексом "
                + index);
    }

}
