/*
* Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер дня недели
* и отобразить на экране то, что запланировано на этот день.
*/

package by.exercise11;

import by.common.exercise11.DealWeek;

public class Main {
    public static void main(String[] args) {
        DealWeek dealWeek = new DealWeek();
        String out = dealWeek.deal(5);
        System.out.println(out);
    }
}
