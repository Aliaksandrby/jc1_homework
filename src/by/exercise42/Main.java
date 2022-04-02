/*
* Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
* а значением - количество повторений этого слова в тексте.
*
* Some text which i input in some place text @
* что бы учесть учитывать регистр убрать комментарий TODO
*/

package by.exercise42;

import by.common.exercise27.ReadConsole;

public class Main {
    public static void main(String[] args) {
        UserConsole.invite();
        String text = new ReadConsole().textToString("@");
        TextMap textMap = new TextMap(text);
        UserConsole.showMap(textMap);
    }
}
