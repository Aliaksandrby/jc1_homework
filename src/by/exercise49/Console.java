package by.exercise49;

import java.util.ArrayList;

public class Console {

    public static void show(Numbers numbers) {
        if(numbers == null) {
            System.out.println("Nothing to write!!!");
            return;
        }
        for (int num : numbers.getRandomNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void showNumbersFromFile(ArrayList<Integer> numFromFile) {
        for (int num : numFromFile) System.out.print(num + " ");
        System.out.println();
    }

    public static void showAverageArithmetic(double average) {
        System.out.println("Average arithmetic = " + average);
    }
}
