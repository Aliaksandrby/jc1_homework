/*
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * всех тегов абзацев, в том числе тех, у которых есть параметры, например,
 * <p id="p1">, и замену их на простые теги абзацев <p>. Результат работы
 * метода выведите на экран.
 * "<p class = \"cl0\" id = \"id0\" anything>first</p><p>second</p><p class = \"cl1\" id = \"id1\" ttt>third</p><p something>forth</p><p good>fifth</p>";
 */
package by.exercise30;

import by.common.exercise29.ReadConsole;
import by.common.exercise30.ChangeSubstring;

public class Main {
    public static void main(String[] args) {
        String input = ReadConsole.getString();
        StringBuilder out = ChangeSubstring.replaceParagraph(input);
        System.out.println(out);
    }
}