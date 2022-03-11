package by.common.exercise21;

import java.util.ArrayList;
import java.util.Random;

public class Array {

    private int[] array = new int[10];

    private int getRandom() {
        return (int)(new Random().nextDouble()*10);
    }

    public int[] setArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom();
        }
        return array;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }
        return max;
    }

    public static int[] getIndexes(int[] array, int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(number == array[i]) arrayList.add(i);
        }
        return toArrayInt(arrayList);
    }

    private static int[] toArrayInt(ArrayList<Integer> arrayList) {
        int[] indexes = new int[arrayList.size()];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = arrayList.get(i);
        }
        return indexes;
    }

    public static Integer sumElementArrayInt(int[] array,int start,int end) {
        if((start < 0) || (start > array.length-1) || (end < 0) || (end > array.length-1)) {
            System.out.println("check parameters sumElementArrayInt(...)");
            System.exit(1);
        }
        Integer sum = 0;
        //if(end == start) return sum;
        /*if(start > end) {
            for (int i = end+1; i < start; i++) {
                sum += array[i];
            }
        } else {
            for (int i = start+1; i < end; i++) {
                sum += array[i];
            }
        }*/
        for (int i = Math.min(start,end)+1; i < Math.max(start,end); i++) {
            sum += array[i];
        }
        return sum;
    }
}

