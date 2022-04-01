/*
* Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
* Найти самую высокую оценку с использованием итератора.
*/

package by.exercise41;

import by.exercise39.*;

public class Main {
    public static void main(String[] args) {
        ListInt listMark = new ListInt();
        listMark.fillRandomList(5);
        Console.showList(listMark);
        int maxMark = listMark.maxMark();
        Console.showMark(maxMark);
    }
}
