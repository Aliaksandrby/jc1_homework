package by.exercise54;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadWriterFile implements Runnable {

    private final String fileName;
    private final Thread thread;
    private final int[] array;

    public ThreadWriterFile(String fileName, String threadName,int sizeArray) {
        this.thread = new Thread(this,threadName);
        this.fileName = fileName;
        this.array = new GenerateArrays(sizeArray).getArray();
        this.thread.start();
    }

    @Override
    public void run() {
        writeFile();
    }

    private void writeFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) { // TODO: append = true
            for (int j : array) {
                //System.out.println(thread.getName() + ":" + j);
                writer.write(thread.getName() + ":" + j + "\n");
            }
        } catch (IOException exc) {
            System.out.println("Error create file: " + exc);
        }
    }
}
