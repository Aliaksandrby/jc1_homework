package by.exercise58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task implements Callable<HashMap<CopyOnWriteArrayList<String>,String>> {

    private final CopyOnWriteArrayList<String> list;
    private static int count;
    private final String[] elements = {
            "zero","one","two","three","four",
            "five","six","seven","eight", "nine"
    };

    public Task() {
        this.list = new CopyOnWriteArrayList<>();
    }

    private int generateNumber() {
        return (int)(new Random().nextDouble()*10);
    }

    private String generateString() {
        int numberOfElements = generateNumber();
        if(numberOfElements == 0) return "tab";
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < numberOfElements; i++) {
            str.append(elements[generateNumber()]).append(" ");
        }
        return str.toString();
    }

    private HashMap<CopyOnWriteArrayList<String>,String> writeFile() {
        HashMap<CopyOnWriteArrayList<String>,String> listTreadName = new HashMap<>();
        if(new File("folder").mkdir()) {
            System.out.println("folder is created");
        }
        for (int i = 0; i < 10; i++) {
            String fileName = "file_" + (++count) + ".txt";
            list.add(fileName);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("folder/" + fileName))) {
                for (int j = 0; j < 10; j++) writer.write(generateString() + "\n");
            } catch (IOException exc) {
                System.out.println("Error work with file: " + exc);
            }
        }
        sleepFromTo(1000,3000);
        listTreadName.put(list,Thread.currentThread().getName());
        return listTreadName;
    }

    private void sleepFromTo(int a,int b) {
        try {
            Thread.sleep((long)(Math.random()*(b-a)+a));
        } catch(InterruptedException exc) {
            System.out.println("something went wrong with your Thread.sleep()");
        }
    }

    @Override
    public HashMap<CopyOnWriteArrayList<String>,String> call() {
        return writeFile();
    }
}
