package by.common.exercise27;

import java.util.Scanner;

public class ReadConsole {
    public String textToString(String endsOfText) {
        Scanner scanner = new Scanner(System.in);
        String text = "", element = "";
        do {
            text += element;
            element = scanner.next() + " ";
        } while (!element.equals(endsOfText + " "));
        scanner.close();
        return text;
    }

    public String string() {
        return new Scanner(System.in).nextLine();
    }

}
