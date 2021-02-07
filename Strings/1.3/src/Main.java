public class Main {
    public static void main(String[] args) {

        String str = "123 jsj34hjfhdj 02930 jd 2";
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n++;
            }
        }

        System.out.println(n);

    }
}
