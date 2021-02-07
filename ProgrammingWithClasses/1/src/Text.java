public class Text {

    private final String head;
    private String text;

    public Text(Word word) {
        head = word.getValue();
    }

    public Text(Phrase phrase) {
        head = phrase.getValue();
    }

    public String getHead() {
        return head;
    }

    public String getText() {
        return text;
    }

    public void addText(Word word) {
        text += word.getValue() + " ";
    }

    public void addText(Phrase phrase) {
        text += phrase.getValue() + " ";
    }

}
