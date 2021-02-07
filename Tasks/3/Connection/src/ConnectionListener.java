import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface ConnectionListener {

    void onConnectionReady(Connection connection);
    void onDisconnect(Connection connection);
    void onReceive(Connection connection, String msg) throws IOException, SAXException, ParserConfigurationException;
    void onException(Connection connection, Exception e);

}
