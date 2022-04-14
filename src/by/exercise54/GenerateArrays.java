package by.exercise54;

import java.util.Random;

public class GenerateArrays {
    private final int[] array;

    public GenerateArrays(int sizeArray) {
        if(sizeArray < 0) {
            System.out.println("check size array");
            System.exit(1);
        }
        this.array = new int[sizeArray];
        setArray();
    }

    private int generateNumber() {
        return (int)(new Random().nextDouble()*100);
    }

    private void setArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber();
        }
    }

    public int[] getArray() {
        return array;
    }
}
