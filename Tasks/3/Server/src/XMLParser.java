import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLParser {

    private static final ArrayList<Student> students = new ArrayList<>();

    public static String readXML() throws ParserConfigurationException, IOException, SAXException {
        StringBuilder stringBuilder = new StringBuilder();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("C:/my/Java/Java training/Tasks/3/Server/src/students.xml"));
        NodeList nodeList = document.getElementsByTagName("Student");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node student = nodeList.item(i);
            NamedNodeMap attributes = student.getAttributes();
            students.add(new Student(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("age").getNodeValue()));
        }

        for (Student student: students) {
            stringBuilder.append(student.toString());
        }

        return String.valueOf(stringBuilder);
    }

    public static void writeXML(ArrayList<Student> studentArrayList) throws TransformerException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        students.addAll(studentArrayList);

        Element element = document.createElement("Student");
        Element rootElement = document.createElement("Students");
        document.appendChild(rootElement);
        rootElement.appendChild(element);

        for (Student student: studentArrayList) {
            element.setAttribute("name", student.getName());
            element.setAttribute("age", student.getAge());
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource domSource = new DOMSource(document);

        StreamResult console = new StreamResult(System.out);
        StreamResult file = new StreamResult(new File("C:/my/Java/Java training/Tasks/3/Server/src/students_document.xml"));

        transformer.transform(domSource, console);
        transformer.transform(domSource, file);
    }

}
