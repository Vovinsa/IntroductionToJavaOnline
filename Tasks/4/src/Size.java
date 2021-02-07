public enum Size {
    SMALL(50),
    BIG(100);

    private final int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
