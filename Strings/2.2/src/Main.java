public class Main {
    public static void main(String[] args) {

        String str = "asss aaasssss";
        StringBuilder sb = new StringBuilder();

        for (char i: str.toCharArray()) {
            sb.append(i);
            if (i == 'a') {
                sb.append('b');
            }
        }

        System.out.println(sb);

    }
}
