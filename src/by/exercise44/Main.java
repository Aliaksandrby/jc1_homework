/*
 * Написать собственное исключение от Exception. Сгенерировать код, который
 * будет выбрасывать его и обрабатывать. Результат работы программы вывести на экран.
 */

package by.exercise44;

import by.exercise43.Exceptioner;

public class Main {
    public static void main(String[] args) {
        Exceptioner exceptioner = new Exceptioner();
        exceptioner.handlerMyException("Say HI Exception");
    }
}
