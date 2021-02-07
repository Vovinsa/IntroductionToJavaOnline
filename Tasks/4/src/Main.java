import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Port port = new Port();
        ShipGenerator shipGenerator = new ShipGenerator(port, 10);

        PierLoader pierLoader1 = new PierLoader(port);
        PierLoader pierLoader2 = new PierLoader(port);
        PierLoader pierLoader3 = new PierLoader(port);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();

    }
}
