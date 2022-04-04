package by.exercise47;

public class UserOutput {

    private final ReadFile readFile;

    public UserOutput(String pathToFile) {
        readFile = new ReadFile(pathToFile);
    }

    public void showNumberOfWords() {
        String regex = "[а-яА-Я_0-9]+.?";
        int value = readFile.numberOf(readFile.getText(),regex);
        System.out.println("words = " + value);
    }

    public void showNumberOfMarks() {
        String regex = ".*?[,-.:;-?!]";
        int value = readFile.numberOf(readFile.getText(),regex);
        System.out.println("punctuation marks = " + value);
    }
}
