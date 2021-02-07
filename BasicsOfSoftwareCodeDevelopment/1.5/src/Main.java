import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hh;
        int mm;
        int ss;
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        hh = t / 3600;
        mm = (t - hh * 3600) / 60;
        ss = t - hh * 3600 - mm * 60;

        System.out.println(hh + "ч " + mm + "мин " + ss + "с");

    }
}
