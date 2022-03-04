/*
 * Посчитать сумму цифр числа 7_893_823_445 с помощью цикла do while.
 *  53
 */

package by.exercise14;

import by.common.exercise14.Sum;

public class Main {
    public static void main(String[] args) {
        int number = new Sum().sumDigit(7893823445L);
        System.out.println(number);
    }
}
