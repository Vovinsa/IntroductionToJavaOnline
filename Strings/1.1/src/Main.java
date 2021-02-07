public class Main {
    public static void main(String[] args) {

        String[] arr = {"NameCase", "VillageFactor", "HomeStrong", "ComeBack"};

        for (int i = 0; i < arr.length; i++) {

            StringBuilder result = new StringBuilder();
            char c = arr[i].charAt(0);
            result.append(Character.toLowerCase(c));

            for (int j = 1; j < arr[i].length(); j++) {

                char ch = arr[i].charAt(j);

                if (Character.isUpperCase(ch)) {
                    result.append("_");
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(ch);
                }

            }

            System.out.println(result);

        }

    }
}
