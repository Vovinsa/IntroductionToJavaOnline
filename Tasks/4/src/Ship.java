public class Ship {

    private int numOfContainers;
    private final Size size;


    public Ship(Size size) {
        this.size = size;
    }

    public boolean check() {
        return numOfContainers < size.getSize();
    }

    public void add(int numOfContainers) {
        this.numOfContainers += numOfContainers;
    }

    public Size getSize() {
        return size;
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }
}
