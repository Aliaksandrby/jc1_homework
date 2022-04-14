package by.exercise53;

import java.util.Arrays;
import java.util.Random;

public class ThreadGeneratingArrayNumbers implements Runnable {
    private final Thread thread;
    private final int sizeArray;

    public ThreadGeneratingArrayNumbers(String nameThread,int sizeArray) {
        thread = new Thread(this,nameThread);
        this.sizeArray = sizeArray;
        thread.start();
    }

    public static class GeneratorArrayNumbers {
        private final int[] array;

        public GeneratorArrayNumbers(int genNumbers) {
            if(genNumbers < 1) {
                System.out.println("check array length");
                System.exit(1);
            }
            array = new int[genNumbers];
        }

        private int generateNumber() {
            return (int)(new Random().nextDouble()*100);
        }

        private void generateArray() {
            for (int i = 0; i < array.length; i++) {
                array[i] = generateNumber();
            }
        }

        public int findMaxElementInArray() {
            generateArray();
            Arrays.sort(array);
            return array[array.length-1];
        }
    }

    @Override
    public void run() {
        int maxValue = new GeneratorArrayNumbers(sizeArray).findMaxElementInArray();
        UserOut.show(thread.getName(),maxValue);
    }
}
