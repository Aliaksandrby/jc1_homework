package by.exercise46;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    public static String inputPath() {
        return new Scanner(System.in).next();
    }

    public static void show(ArrayList<String> thing) {
        int count = 1;
        for (String str : thing) {
            System.out.println("[" + count + "]" + str + " ");
            count++;
        }
        System.out.println();
    }

    public static void invitation() {
        System.out.print("Input path to your folder: ");
    }
}
