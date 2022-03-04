/*
* Для целых чисел, которые деляться на 7 в диапазоне от 1 до 100, вывести на экран строку "Hope!"
*/

package by.exercise16;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++)
            if(i%7 == 0)
                System.out.println(i + " Hope!");
    }
}
