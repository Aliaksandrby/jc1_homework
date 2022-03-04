/*
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями
 * целочислесленного типа. Найдите максимальный элемент и выведите его индекс.
 */

package by.exercise20;

import by.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArrayFromOneToTen();
        int maxElement = array.findMaxElOfArray();
        String indexes = array.outIndexesElOfArray(maxElement);
        outData(array,maxElement,indexes);
    }
    public static void outData(Array array,int maxElement, String indexes) {
        array.outArray(array.getArray());
        System.out.println("Max element: " + maxElement);
        System.out.println(indexes);
    }
}
