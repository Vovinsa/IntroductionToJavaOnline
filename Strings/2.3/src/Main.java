public class Main {
    public static void main(String[] args) {

        String str = "hghgh";
        StringBuilder sb = new StringBuilder(str);

        if (str.equals(sb.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
