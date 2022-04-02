/*
 * Написать метод, который будет возбуждать исключение и обрабатывать
 * исключение на уровне выше. Результат работы программы вывести на экран.
 */

package by.exercise45;

import by.exercise43.Exceptioner;

public class Main {
    public static void main(String[] args) {
        Exceptioner exceptioner = new Exceptioner();
        exceptioner.handlerMyExceptionUp("Message for my exception");
    }
}
