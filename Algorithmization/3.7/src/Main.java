import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> in = new ArrayList<>() {
            {add(1); add(2); add(2); add(7); add(9); add(11); add(15);}
        };

        List<Integer> from = new ArrayList<>() {
            {add(3); add(5); add(5); add(7); add(14); add(19); add(20);}
        };

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) {
                indexes.add(-(dex + 1) + i);
            } else {
                indexes.add(dex + i);
            }
        }

        System.out.println(indexes);

    }
}
