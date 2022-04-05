/*
* Записать с помощью Java в двоичный файл 20 случайных чисел.
* Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
*/

package by.exercise49;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Numbers numbers = new Numbers();

        for (int count : numbers.getRandomNumbers()) {
            System.out.print(count + " ");
        }
        System.out.println();

        DataOutputStream out = new DataOutputStream(new FileOutputStream("binaryFile"));
        for (int number : numbers.getRandomNumbers()) {
            out.write(number);
        }

        DataInputStream in = new DataInputStream(new FileInputStream("binaryFile"));
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = in.read();
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : newArray) {
            sum += num;
        }
        double value = (double)sum/newArray.length;
        System.out.println(value);

    }
}
