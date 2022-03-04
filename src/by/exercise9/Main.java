/*
* Задать три числа - день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
*/

package by.exercise9;

import by.common.OutData;
import by.common.exercise9.WorkWithData;

public class Main {
    public static void main(String[] args) {
        WorkWithData day = new WorkWithData(28,2,2022);
        String out = new OutData().outPutDay(day.nextDay());
        System.out.println(out);
    }
}
