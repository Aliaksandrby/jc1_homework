/*
 * Найти среди чисел от 50 до 70 второе простое число (число называется простым, если оно делится
 * без остатка только на 1 и себя) и завершить цикл с использованием break.
 */

package by.exercise15;

import by.common.exercise15.Primes;

public class Main {
    public static void main(String[] args) {
        Primes prime = new Primes();
        prime.findSecondPrimeFromFiftyToSeventy();
    }
}
