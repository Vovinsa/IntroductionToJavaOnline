public class Phrase {

    private String value;

    public void addValue(Word word) {
        value += word.getValue() + " ";
    }

    public String getValue() {
        return value;
    }
}

