import java.util.Random;

public class ShipGenerator implements Runnable {

    private final Port port;
    private int shipCount;

    public ShipGenerator(Port port, int shipCount) {
        this.port = port;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < shipCount) {
            Thread.currentThread().setName("Generator ship");
            shipCount++;
            try {
                port.addShip(new Ship(getRandomSize()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
