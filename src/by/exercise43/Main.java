/*
 * Написать код, который выбрасывает NullPointerException. Написать обработчик
 * этого исключения и вывести на экран сообщение, которое будет содержать
 * описание данного исключения.
 */

package by.exercise43;

public class Main {
    public static void main(String[] args) {
        Exceptioner exceptioner = new Exceptioner();
        exceptioner.handlerNullPointerException();
    }
}

