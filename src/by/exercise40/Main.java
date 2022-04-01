/*
 * Создать коллекцию, заполнить ее случайными целыми числами.
 * Удалить повторяющиеся числа.
 */

package by.exercise40;

import by.exercise39.*;

public class Main {
    public static void main(String[] args) {
        ListInt listInt = new ListInt();
        listInt.fillRandomList(20);
        Console.showList(listInt);
        listInt.rmRepeatNumbers();
        Console.showList(listInt);
    }
}
