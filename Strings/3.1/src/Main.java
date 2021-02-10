import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static final String PARAGRAPH_SPLIT_REGEX = "(?m)(?!\\A)(?=\\s{4})";
    private static final String SENTENCE_SPLIT_REGEX = "(?<=[.?])\\s(?=[A-Z])";

    private List<String> allTextList;
    private String allTextString = "";

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.readTextFromFile("text.txt");

        String[] paragraph = main.paragraphSplit();
        String[] paragraphSortRes = main.paragraphSort(paragraph);
        String[] sentence = main.sentenceSplit(paragraph[1]);

        System.out.println(Arrays.toString(paragraph));
        System.out.println(Arrays.toString(sentence));
        System.out.println(Arrays.toString(paragraphSortRes));

        main.wordSort(paragraphSortRes);

    }

    public List<String> readTextFromFile(String path) throws IOException {
        allTextList = Files.readAllLines(Paths.get("C:\\my\\Java\\Java training\\Strings\\3.1\\src\\" + path), StandardCharsets.UTF_8);
        readTextFromFile();
        return allTextList;
    }

    public void readTextFromFile() {
        StringBuilder sb = new StringBuilder();
        for (String s : allTextList) {
            sb.append(s);
        }
        allTextString = sb.toString();

    }

    public String[] paragraphSplit() {
        return allTextString.split(PARAGRAPH_SPLIT_REGEX);
    }

    public String[] sentenceSplit(String paragraph) {
        return paragraph.split(SENTENCE_SPLIT_REGEX);
    }

    public String[] paragraphSort(String[] paragraph) {
        int[] lengthSentences = new int[paragraph.length];
        String[] forSortParagraph = new String[paragraph.length];

        for (int i = 0; i < paragraph.length; i++) {
            String[] sentence = sentenceSplit(paragraph[i]);
            lengthSentences[i] = sentence.length;
        }

        for (int i = 0; i < paragraph.length; i++) {
            int count = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < lengthSentences.length; j++) {
                if (count > lengthSentences[j] && lengthSentences[j] != 0) {
                    count = lengthSentences[j];
                    index = j;
                }
            }
            lengthSentences[index] = 0;
            forSortParagraph[i] = paragraph[index];
        }
        return forSortParagraph;
    }

    public List<String[]> wordSort(String[] sentence) {
        List<String[]> listSentences = new ArrayList<>();

        Comparator<String> comparator = Comparator.comparingInt(String::length);

        for (String value : sentence) {
            listSentences.add(value.split("\\s"));
        }

        for (String[] s : listSentences) {
            Arrays.sort(s, comparator);
            System.out.print(Arrays.toString(s));
        }
        System.out.println();
        return listSentences;
    }
}
