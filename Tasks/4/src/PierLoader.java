public class PierLoader implements Runnable {

    private final Port port;

    public PierLoader(Port port) {
        this.port = port;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(500);
                Ship ship = port.getShip();
                if (ship != null) {
                    while (ship.check()) {
                        Thread.sleep(100);
                        ship.add(10);
                        System.out.printf("%s loaded... %s", ship.getNumOfContainers(), Thread.currentThread().getName());
                    }
                }
             } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
