/*
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями
 * целочисленного типа. Выведите на экран, переверните и снова выведите на экран (при
 * переворачивании нежелательно создавать еще один массив).
 */

package by.exercise22;

import by.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(11);
        array.fillRandomArrayFromOneToTen();
        array.outArray(array.getArray());
        array.reverse(array.getArray());
        array.outArray(array.getArray());
    }
}

