/*
* Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа
* семеркой и вернуть boolean значение.
*/

package by.exercise6;

import by.common.exercise6.CheckNumber;

public class Main {
    public static void main(String[] args) {
        CheckNumber checkNumber = new CheckNumber();
        boolean out = checkNumber.isLastDigitSeven(475888871);
        System.out.println(out);
    }
}
