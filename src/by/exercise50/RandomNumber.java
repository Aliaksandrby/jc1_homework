package by.exercise50;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber() {
        return (int)(new Random().nextDouble()*10);
    }

    public static ArrayList<Integer> randomNumbers(int num) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < num; i++) randomNumbers.add(getRandomNumber());
        return randomNumbers;
    }
}
