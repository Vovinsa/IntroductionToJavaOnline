public class Main {
    public static void main(String[] args) {

        String str = "aabbcc dd ee";
        StringBuilder sb = new StringBuilder();

        str.replaceAll("\\s+", "").chars().distinct().forEach(c -> sb.append((char) c));
        
        System.out.println(sb);

    }
}
