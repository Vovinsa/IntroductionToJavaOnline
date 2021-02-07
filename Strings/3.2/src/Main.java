import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String XML_SPLIT_REGEX = "((?<open><[^/>]+?>)(?<body>.+?)(?<close></.+?>))|(?<openOnly><[^/>]+?>)|(?<closeOnly></.+?>)|(?<noBody><.+? />)|";
    private List<String> allXmlTextList;
    private String allTextString = "";

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        for (String s : main.readTextFromFile("C:\\my\\Java\\Java training\\Strings\\3.2\\src\\xmlText.txt")) {
            System.out.println(s);
        }

        main.xmlParser();

    }

    public List<String> readTextFromFile(String path) throws IOException {
        allXmlTextList = Files.readAllLines(Paths.get(path).toAbsolutePath(), StandardCharsets.UTF_8);
        readTextFromFile();
        return allXmlTextList;
    }

    public void xmlParser() {
        Pattern template = Pattern.compile(XML_SPLIT_REGEX);
        Matcher findTeg = template.matcher(allTextString);

        while (findTeg.find()) {
            if (findTeg.group("open") != null && findTeg.group("close") != null) {
                System.out.println("Open tag: " + findTeg.group("open") + " сlose tag: " + findTeg.group("close") + " тело тега: " + findTeg.group("body"));
            } else if (findTeg.group("close") == null && findTeg.group("openOnly") != null) {
                System.out.println("Open tag: " + findTeg.group("openOnly"));
            } else if (findTeg.group("open") == null && findTeg.group("closeOnly") != null) {
                System.out.println("Close tag: " + findTeg.group("closeOnly"));
            } else if (findTeg.group("noBody") != null) {
                System.out.println("Tag without body: " + findTeg.group("noBody"));
            }
        }
    }

    public void readTextFromFile() {
        StringBuilder sb = new StringBuilder();
        for (String s : allXmlTextList) {
            sb.append(s);
        }
        allTextString = sb.toString();

    }

}
