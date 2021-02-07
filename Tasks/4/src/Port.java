import java.util.ArrayList;

public class Port {

    private int count = 0;
    private final ArrayList<Ship> ships;

    public Port() {
        ships = new ArrayList<>();
    }

    public synchronized void addShip(Ship ship) throws InterruptedException {
        int maxShips = 3;
        if (count < maxShips) {
            notifyAll();
            ships.add(ship);
            System.out.printf("%s The ship is docked: %s, %s%n", ships.size(), ship.getSize(), Thread.currentThread().getName());
            count++;
        } else {
            System.out.printf("%s There is no place for a ship: %s", ships.size(), Thread.currentThread().getName());
            wait();
        }
    }

    public synchronized Ship getShip() throws InterruptedException {
        int minShips = 0;
        if (count > minShips) {
            notifyAll();
            for (Ship ship: ships) {
                count--;
                System.out.printf("%s The ship is taken from the port: %s", ships.size(), Thread.currentThread().getName());
                ships.remove(ship);
                return ship;
            }
        }
        System.out.println("0 There are no ships in the port");
        wait();

        return null;
    }

}
