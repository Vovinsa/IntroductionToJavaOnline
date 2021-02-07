import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Client extends JFrame implements ActionListener, ConnectionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Client::new);
    }

    private final JTextArea log = new JTextArea();
    private final JTextField fieldInput = new JTextField();
    private final JTextField fieldNickname = new JTextField();
    private Connection connection;

    private Client() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int WIDTH = 600;
        int HEIGHT = 600;
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        log.setEditable(false);
        log.setLineWrap(true);
        add(log, BorderLayout.CENTER);


        fieldInput.addActionListener(this);
        add(fieldInput, BorderLayout.SOUTH);
        add(fieldNickname, BorderLayout.NORTH);

        setVisible(true);

        try {
            connection = new Connection(2000, "192.168.100.10", this);
        } catch (IOException e) {
            printMessage("Connection exception: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldInput.getText();
        if (msg.equals("")) return;
        fieldInput.setText(null);
        connection.sendMessage(fieldNickname.getText() + ": " + msg);
    }

    @Override
    public void onConnectionReady(Connection connection) {
        printMessage("Connection is ready");
    }

    @Override
    public void onDisconnect(Connection connection) {
        printMessage("Connection close");
    }

    @Override
    public void onReceive(Connection connection, String msg) {
        printMessage(msg);
    }

    @Override
    public void onException(Connection connection, Exception e) {
        printMessage("Connection exception: " + e);
    }

    private synchronized void printMessage(String msg) {
        SwingUtilities.invokeLater(() -> {
            log.append(msg + "\n");
            log.setCaretPosition(log.getDocument().getLength());
        });
    }
}
