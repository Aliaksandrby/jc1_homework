/*
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 * 15_511_210_043_330_985_984_000_000
 */

package by.exercise13;

import by.common.exercise13.FactorialBigInt;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger product = new FactorialBigInt().multiplyFromOneToTwentyFive();
        System.out.println(product);
    }
}
