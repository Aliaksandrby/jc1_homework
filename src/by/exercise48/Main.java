/*
* Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на экран,
* посчитать сумму, убрать все повторяющие числа и снова вывести на экран.
*/

package by.exercise48;

import by.exercise47.ReadFile;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "c:\\Users\\Hello\\Desktop\\workspace\\java\\education\\HomeWork\\src\\by\\exercise48\\fileText.txt";
        ArrayList<String> listTokens = new ReadFile(pathToFile).getText();
        TextNumber textNumber = new TextNumber();
        textNumber.findNumbers(listTokens,"(\\d?+[,.?]\\d+.?)|(\\d+.?)");
        UserOutput.show(textNumber);
        UserOutput.showSum(textNumber);
        textNumber.removeRepeatNumbers();
        UserOutput.show(textNumber);

    }
}
