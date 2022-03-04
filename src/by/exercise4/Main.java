/*
* Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат
* с произведением двух этих чисел, и возвращает полученный результат из метода. Передать на вход в метод
* любые два числа. Вывести полученный результат работы метода на экран.
*/

package by.exercise4;

import by.common.exercise4.Calculate;

public class Main {
    public static void main(String[] args) {
        long result = new Calculate().sumAndMultiply(100000000,-20000000);
        System.out.println(result);
    }
}
