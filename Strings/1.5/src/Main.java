public class Main {
    public static void main(String[] args) {

        String str = "scnjscn scksck  mskc cskcks   mksmckscm";
        String strr;

        strr = str.trim().replaceAll("\\s{2,}", " ");

        System.out.println(strr);

    }
}
