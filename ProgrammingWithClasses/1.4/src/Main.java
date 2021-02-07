import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Train[] trains = new Train[5];

        trains[0] = new Train("Msk", 122, "12:42");
        trains[1] = new Train("Msk", 123, "12:45");
        trains[2] = new Train("Spb", 34, "23:08");
        trains[3] = new Train("Msk", 33, "12:42");
        trains[4] = new Train("Spb", 156, "05:44");

        for (Train train : trains) {
            train.print();
        }

        int pos;

        pos = scanner.nextInt();
        trains[pos - 1].print();

        Arrays.sort(trains, new Train.ByNumber());

        for (Train train : trains) {
            train.print();
        }

        System.out.println("\n\n\n\n\n");

        Arrays.sort(trains, new Train.ByDestinationAndTime());

        for (Train train : trains) {
            train.print();
        }


    }
}
