import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Connection {

    private final Socket socket;
    private final Thread thread;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final ConnectionListener connectionListener;

    public Connection(int port, String ipAddress, ConnectionListener connectionListener) throws IOException {
        this(new Socket(ipAddress, port), connectionListener);
    }

    public Connection(Socket socket, ConnectionListener connectionListener) throws IOException {
        this.connectionListener = connectionListener;
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out  = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                connectionListener.onConnectionReady(Connection.this);
                try {
                    while (thread.isAlive()) {
                        connectionListener.onReceive(Connection.this, in.readLine());
                    }
                } catch (IOException e) {
                    connectionListener.onException(Connection.this, e);
                } catch (SAXException | ParserConfigurationException e) {
                    e.printStackTrace();
                } finally {
                    connectionListener.onDisconnect(Connection.this);
                }
            }
        });
        thread.start();
    }

    public synchronized void sendMessage(String msg) {
        try {
            out.write(msg + "\r\n");
            out.flush();
        } catch (IOException e) {
            disconnect();
        }
    }

    public synchronized void disconnect() {
        thread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            connectionListener.onException(Connection.this, e);
            disconnect();
        }
    }

    @Override
    public String toString() {
        return "Connection: " + socket.getInetAddress() + " : " + socket.getPort();
    }
}
