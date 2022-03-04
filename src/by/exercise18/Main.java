/*
* Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями
* целочисленного типа и выведите последний элемент массива на экран.
*/

package by.exercise18;


import by.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArray();
        String out = array.lastElementOfArray();
        array.outArray(array.getArray());
        System.out.println(out);
    }
}
