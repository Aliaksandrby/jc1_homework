/* Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных выражений.
Результат работы метода выведите на экран.*/
// 0X123A.AF21fa4 some word 0xFFBD something else 0xDd00 0xdD 0XdD 0X956F-sentence

package by.exercise29;

import by.common.exercise29.*;

public class Main {

    public static void main(String[] args) {
        String inputLine = ReadConsole.getString();
        Search.findHex(inputLine);
    }
}
