public class Main {
    public static void main(String[] args) {

        area(7, 8, 9, 10);

    }

    public static void area(int x, int y, int z, int t){

        double squareTriangle1 = x * y / 2;
        double gep  = Math.hypot(x,y);
        double halfPerTriangle2 = (gep + z + t) / 2;
        double squareTriangle2;

        if ((z + t > gep) && (gep + z >= t) && (gep + t >= z)) {
            squareTriangle2 = Math.sqrt(halfPerTriangle2 * (halfPerTriangle2 - gep) * (halfPerTriangle2 - z) * (halfPerTriangle2 -t));
        } else {
            System.out.println("Quadrangle with sides like this does not exist.");
            squareTriangle2 = squareTriangle1 * (-1);
        }

        double square = squareTriangle1 + squareTriangle2;
        System.out.println("square of quadrangle is " + square);
    }
}
