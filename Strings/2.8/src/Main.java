import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "a aa b ccc dd aaa";
        int max = 0;
        int count = 0;
        String str_max = null;

        for (String s: str.split(" ")) {
            if (s.length() > max) {
                str_max = s;
                max = s.length();
                count++;
            }
         }

        if (count > 1) {
            System.out.println("No");
        } else {
            System.out.println(str_max);
        }
    }
}
