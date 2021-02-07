public class Main {
    public static void main(String[] args) {

        String str = "sdjsdjj sdjisdj  jsdjsd djsdjsa   sdjsdjk";
        int len = 0;
        int max = 0;

        for (char i: str.toCharArray()) {
            if (i == ' ') {
                len++;
                if (len > max) {
                    max = len;
                }
            } else {
                len = 0;
            }
        }

        System.out.println(max);

    }
}
