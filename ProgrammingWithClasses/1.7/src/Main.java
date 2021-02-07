public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Point(1, 2), new Point(2, 3), new Point(5, 6));

        System.out.println(triangle.square());
        System.out.println(triangle.perimeter());
        System.out.println(triangle.median_crossing());

    }
}
