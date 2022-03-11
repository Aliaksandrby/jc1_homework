/*
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями
 * целочисленного типа. Определите сумму элементов массива, расположенных между минимальным и максимальным
 * значениями. Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
 * разницы индексов между максимальным и минимальным значением.
 */

package by.exercise21;

import by.common.exercise21.Array;
import by.common.exercise21.OnScreen;

public class Main {

    public static void main(String[] args) {
        Array array = new Array();
        int[] arrayInt = array.setArray();
        //int[] arrayInt = {9,6,5,8,2,2,5,9,3,9};
        //int[] arrayInt = {9,9,9,9,9,9,9,9,9,9};
        OnScreen.showArray(arrayInt);
        int min = Array.min(arrayInt);
        int max = Array.max(arrayInt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int[] indexesMin = Array.getIndexes(arrayInt,min);
        System.out.print("Indexes minimal element : ");
        OnScreen.showArray(indexesMin);

        int[] indexesMax = Array.getIndexes(arrayInt,max);
        System.out.print("Indexes maximal element : ");
        OnScreen.showArray(indexesMax);

        String out = OnScreen.outData(arrayInt,indexesMin,indexesMax);
        System.out.println(out);

    }


}
