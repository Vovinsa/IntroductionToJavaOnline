public class Main {
    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb = new StringBuilder();

        for (char i: str.toCharArray()) {
            sb.append(i).append(i);
        }

        System.out.println(sb);

    }
}
