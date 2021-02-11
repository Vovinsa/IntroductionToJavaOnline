import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(23, 15, 59);

        System.out.println(time.toString());

        time.setHour(15);
        time.setMinute(25);
        time.setSecond(54);

        System.out.println(time.toString());

        time.setTime(LocalTime.of(11, 11, 11));

        System.out.println(time.toString());

    }
}
