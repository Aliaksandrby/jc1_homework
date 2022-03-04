package by.common;

import java.util.Random;

public class Array {
    private int[] arrayInt;
    private String[][] arrayButterfly;

    public Array() {
    }

    public Array(int arrayLength) {
        setLengthOfArray(arrayLength);
    }

    public void setSizeButterfly(int lengthButterfly) {
        if((lengthButterfly < 3) || (lengthButterfly % 2)==0) {
            System.out.println("It isn't a butterfly!!!");
            return;
        }
        this.arrayButterfly = new String[lengthButterfly][lengthButterfly];
    }

    public void setLengthOfArray(int arrayLength) {
        if(arrayLength < 1) {
            System.out.println("Data incorrect!");
        }
        this.arrayInt = new int[arrayLength];
    }

    public int getRandom() {
        return new Random().nextInt();
    }

    public int getRandomFromOneToTen() {
        return (int)(new Random().nextDouble()*10 + 1);
    }

    public void fillRandomArray() {
        for(int i = 0;i < this.arrayInt.length;i++) {
            arrayInt[i] = getRandom();
        }
    }

    public void fillRandomArrayFromOneToTen() {
        for(int i = 0;i < this.arrayInt.length;i++) {
            this.arrayInt[i] = getRandomFromOneToTen();
        }
    }

    public void outEvenElOfArray(int[] array) {
        for(int i = 0;i < array.length;i++) {
            if(i % 2 == 0) System.out.println(i + " :: " + array[i]);
        }
    }

    public int findMaxElOfArray() {
        int max = arrayInt[0];
        for (int i = 0; i < this.arrayInt.length; i++) {
            if(max < arrayInt[i]) {
                max = arrayInt[i];
            }
        }
        return max;
    }

    public String outIndexesElOfArray(int element) {
        String index = "";
        for (int i = 0; i < arrayInt.length; i++) {
            if(element == arrayInt[i]) index += i + " ";
        }
        return "Index(es) the element of array: " + index;
    }

    public void outArray(int[] array) {
        for (int element : array) System.out.print(element + " ");
        System.out.println();
    }

    public int[] getArray() {
        return arrayInt;
    }

    public int[] reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }
        /* or without 'int temp';
        for (int i = 0; i < array.length/2; i++) {
            array[array.length - (1 + i)] += array[i];
            array[i] = array[array.length - (1 + i)] - array[i];
            array[array.length - (1 + i)] -= array[i];
        }
        */
        return array;
    }

    public void fillArrayButterfly() {
        for (int i = 0; i < arrayButterfly.length; i++) {
            for (int j = 0; j < arrayButterfly.length; j++) {
                if(i <= arrayButterfly.length/2) {
                    if(i > j) {
                        arrayButterfly[i][j] = "0 ";
                        arrayButterfly[i][arrayButterfly.length-1-j] = "0 ";
                    }
                } else {
                    arrayButterfly[i] = arrayButterfly[arrayButterfly.length-i-1];
                }
                if(arrayButterfly[i][j] == null) arrayButterfly[i][j] = "1 ";
            }
        }
    }

    public void drawButterfly() {
        for(String[] element : arrayButterfly) {
            for(String str : element) {
                System.out.print(str);
            }
            System.out.println();
        }
        System.exit(0);
    }
    
    public String lastElementOfArray() {
        return arrayInt[arrayInt.length-1] + " - it's the last element of our array";
    }
}