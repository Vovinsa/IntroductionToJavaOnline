public class Main {
    public static void main(String[] args) {

        String str = "A aaa AAAывщыш ывылвл ывлщЩЛЛвлытлыьAAA";
        int small = 0;
        int big = 0;

        for (char c: str.replaceAll("\\s+", "").replaceAll("[а-яА-Я]", "").toCharArray()) {
            if (Character.isUpperCase(c)) big++;
            else small++;
        }

        System.out.println(big + " " + small);

    }
}
