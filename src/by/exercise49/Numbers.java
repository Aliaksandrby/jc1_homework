package by.exercise49;

import java.util.ArrayList;
import java.util.Random;

public class Numbers {
    private final ArrayList<Integer> randomNumbers;

    public Numbers(int n) {
        this.randomNumbers = new ArrayList<>();
        fillRandomNumbers(n);
    }

    private int getNumber() {
        return (int)(new Random().nextDouble()*10);
    }

    private void fillRandomNumbers(int n) {
        if(n < 1) {
            System.out.println("Wrong argument");
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {
            randomNumbers.add(getNumber());
        }
    }

    public double averageArithmetic(ArrayList<Integer> numFromFile) {
        double sum = 0;
        double average = 0;
        for (int num : numFromFile) sum += num;
        try {
            average = sum/numFromFile.size();
        } catch (ArithmeticException exc) {
            System.out.println("NO NUMBERS IN THIS FILE!!!");
        }
        return average;
    }

    public ArrayList<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
