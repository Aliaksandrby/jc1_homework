/*
* Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа. Определить, можно ли его полностью
* закрыть круглой картонкой радиусом r (тоже целое число).
*/

package by.exercise7;

import by.common.exercise7.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        boolean out = rectangle.isCovers(6,8,5);
        System.out.println(out);
    }
}
