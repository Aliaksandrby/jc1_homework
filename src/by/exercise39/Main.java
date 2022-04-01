/*
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 *
 * Неудовлетворительная оценка в Беларуси все что < 4, нуль отсутствует.
 */

package by.exercise39;

public class Main {

    public static void main(String[] args) {
        ListInt listMark = new ListInt();
        listMark.fillRandomList(20);
        Console.showList(listMark);
        listMark.rmNegativeMark();
        Console.showList(listMark);
    }
}
