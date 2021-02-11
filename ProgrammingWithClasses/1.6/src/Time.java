import java.time.DateTimeException;
import java.time.LocalTime;

public class Time {

    private int hour;
    private int minute;
    private int second;
    private LocalTime time;

    public Time(int hour, int minute, int second) {
        try {
            time = LocalTime.of(hour, minute, second);
        } catch (DateTimeException e) {
            time = LocalTime.of(0, 0, 0);
        }
    }

    public void setTime(LocalTime time) {
        try {
            this.time = time;
            this.hour = time.getHour();
            this.minute = time.getMinute();
            this.second = time.getSecond();
        } catch (DateTimeException e) {
            this.time = LocalTime.of(0, 0, 0);
        }
    }

    public void setHour(int hour) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.hour = hour;
        } catch (DateTimeException e) {
            time = LocalTime.of(0, minute, second);
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.minute = minute;
        } catch (DateTimeException e) {
            time = LocalTime.of(hour, 0, second);
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        try {
            time = LocalTime.of(hour, minute, second);
            this.second = second;
        } catch (DateTimeException e) {
            time = LocalTime.of(hour, minute, 0);
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", time=" + time +
                '}';
    }
}
