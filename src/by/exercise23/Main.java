/*
 * Создать двухмерный квадратный массив и заполнить его "бабочкой".
 */

package by.exercise23;

import by.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.setSizeButterfly(11);
        array.fillArrayButterfly();
        array.drawButterfly();
    }
}