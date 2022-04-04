package by.exercise47;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private final ArrayList<String> text;

    public ReadFile(String pathToFile) {
        this.text = new ArrayList<>();
        textToArrayList(pathToFile);
    }

    private void textToArrayList(String pathToFile) {
        File filePath = new File(pathToFile);
        //TODO: как получить абсолютный путь к файлу?
        try(Scanner scanner = new Scanner(filePath)) {
            while (scanner.hasNext()) {
                text.add(scanner.next());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("The file is not found" + exception);
        }
    }

    public int numberOf(ArrayList<String> text,String regex) {
        int value = 0;
        for (String str : text) {
            if(str.matches(regex)) value++;
        }
        return value;
    }

    public ArrayList<String> getText() {
        return text;
    }
}
