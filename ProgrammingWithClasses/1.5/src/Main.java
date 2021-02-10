public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter(15);
        counter.printStat();
        counter.increase(7);
        counter.printStat();
        counter.decrease(7);
        counter.printStat();

    }
}
