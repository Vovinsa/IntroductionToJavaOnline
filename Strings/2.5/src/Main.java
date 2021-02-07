public class Main {
    public static void main(String[] args) {

        String str = "axnxc a sjcjsjj aajijkajkcjkcaaaaa";
        int count = 0;

        for (char i: str.toCharArray()) {
            if (i == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
