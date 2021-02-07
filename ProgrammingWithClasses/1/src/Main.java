public class Main {
    public static void main(String[] args) {

        /*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

        Word word = new Word("quote");
        Text text = new Text(word);

        Word word1 = new Word("quote's");
        Word word2 = new Word("Les");
        Word word3 = new Word("Brawn");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addText(phrase);

        System.out.println("Head: "+text.getHead());
        System.out.println("Body: "+text.getText());


    }
}
