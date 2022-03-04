/*
 * Создайте переменную для массива из 10 элементов (другим способом). Заполните его произвольными значениями
 * целочисленного типа и выведите на экран элементы, стоящие на четных позициях.
 */

package by.exercise19;

import by.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArray();
        array.outEvenElOfArray(array.getArray());
    }
}
