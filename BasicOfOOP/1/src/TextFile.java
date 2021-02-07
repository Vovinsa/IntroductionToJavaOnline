import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFile {

    private Directory directory;
    private File file;

    public TextFile(Directory directory, File file) throws IOException {
        this.directory = directory;
        directory.mkdir();
        this.file = file;
        file.createNewFile();
    }


    public void create(String path) throws IOException {
        if (path.contains(".txt")) {
            file = new File(path);
            file.createNewFile();
        } else {
            directory = new Directory(path);
            directory.mkdir();
        }

    }

    public void printConsole() throws IOException {
        List<String> list = Files.readAllLines(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8);
        list.forEach(System.out::println);
    }

    public void rename(String newName) {
        if (newName.contains(".txt")) {
            file.renameTo(new File(file.getParent() + "/" + newName));
        } else {
            directory.renameTo(new Directory(directory.getParent() + "/" + newName));
        }
    }

    public void deleted() {
        file.delete();
        directory.delete();
    }


    public void addText(String text) throws IOException {
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file.getAbsolutePath(), true), StandardCharsets.UTF_8));
        writer.write(text);
        writer.close();
    }

}
