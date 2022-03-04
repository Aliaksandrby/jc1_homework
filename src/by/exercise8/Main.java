/*
* Задать целое число в виде переменной, это число - сумма денег в рублях. Вывести это число на экран, добавив к нему
* слово "рублей" в правильном падеже.
*/

package by.exercise8;

import by.common.OutData;
import by.common.exercise8.Money;

public class Main {
    public static void main(String[] args) {
        Money money = new Money();
        new OutData().outMoney(money,21);
    }
}
