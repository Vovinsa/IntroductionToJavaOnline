import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class Server implements ConnectionListener {
    public static void main(String[] args){
        new Server();
    }

    private final ArrayList<Connection> connections = new ArrayList<>();

    public Server() {
        System.out.println("Server running...");
        try(ServerSocket serverSocket = new ServerSocket(2000)) {
            while (true) {
                new Connection(serverSocket.accept(), this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void onConnectionReady(Connection connection){
        connections.add(connection);
        sendToAllConnections("Client connected: " + connection.toString());
    }

    @Override
    public synchronized void onDisconnect(Connection connection) {
        connections.remove(connection);
        sendToAllConnections("Client disconnected: " + connection.toString());
    }

    @Override
    public void onReceive(Connection connection, String msg) throws IOException, SAXException, ParserConfigurationException {
        connection.sendMessage("1 - Просмотреть студентов\n2 - Создать дело");
        
        switch (msg) {
            case "2": connection.sendMessage(XMLParser.readXML());
            case "1": {
                ArrayList<Student> students = new ArrayList<>();
                students.add(new Student("Anya", "19"));
                try {
                    XMLParser.writeXML(students);
                } catch (TransformerException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void onException(Connection connection, Exception e) {
        System.out.println("Connection exception: " + e);
    }

    public void sendToAllConnections(String value) {
        System.out.println(value);
        for (Connection connection : connections) {
            connection.sendMessage(value);
        }
    }

}
