import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Directory directory = new Directory("C:\\my\\Java\\Java training\\BasicOfOOP\\1\\src\\");
        File file = new File(directory, "text.txt");

        TextFile textFile = new TextFile(directory, file);

        textFile.printConsole();
        textFile.addText("TEXT ADDED");
        textFile.printConsole();
        textFile.deleted();
        textFile.create(directory.getPath());
        textFile.create(directory.getPath() + "/" + file.getName());
        textFile.rename("text3.txt");
    }
}
