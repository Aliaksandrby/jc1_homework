/*
* Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
*/

package by.exercise28;

import by.common.exercise27.ReadConsole;
import by.common.exercise27.TransformText;
import by.common.exercise28.TransformString;

public class Main {
    public static void main(String[] args) {
        String str = new ReadConsole().textToString("@");
        String[] arrWord = new TransformText().textToWordArray(str);
        new TransformString().lastLettersWords(arrWord);
    }
}
