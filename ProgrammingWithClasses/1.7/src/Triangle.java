public class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);

        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public double perimeter() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);

        return ab + bc + ac;
    }

    public Point median_crossing() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }

}
