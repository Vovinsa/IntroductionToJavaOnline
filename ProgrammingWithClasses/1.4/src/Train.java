import java.util.Comparator;

public class Train {

    private final String destination;
    private final int number;
    private final String time;

    public Train(String destination, int number, String time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public static class ByNumber implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.number - o2.number;
        }
    }

    public static class ByDestinationAndTime implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            if (o1.destination.equals(o2.destination)) {
                return o1.time.compareTo(o2.time);
            }

            return o1.destination.compareTo(o2.destination);
        }
    }

    public void print() {
        System.out.println(number + " " + destination + " " + time);
    }

}
