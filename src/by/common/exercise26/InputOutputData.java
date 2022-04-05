package by.common.exercise26;

import java.util.Scanner;

public class InputOutputData {

    private String[] marks = {"...","--",".","?","!",":",";",",","-","(",")"};

    public String getStringLine() {
        System.out.println("Программа считает количество знаков препинания в предложении.");
        System.out.println("Введите предложение.");
        return new Scanner(System.in).nextLine();
    }

    public String[] getMarks() {
        return marks;
    }

    public void outData(Marks counter,String input,String[] marks) {
       int count = counter.counterMarks(marks,input);
        System.out.println("Количество знаков препинания = " + count);
    }
}
