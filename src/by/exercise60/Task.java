package by.exercise60;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    @Override
    public String call() {
        String msg = null;
        try {
            msg = writeFile();
        } catch (Exception exc) {
            System.out.println("Exception: " + exc);
        }
        return Thread.currentThread().getName() + " : " + msg;
    }

    private synchronized String writeFile() {
        String msg = "Hello world" + " " + getCurrentTime() + "\n";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("taskCallable.txt",true))) {
            writer.write(msg);
            Thread.sleep(1000); // delete
        } catch (IOException | InterruptedException exc) {
            System.out.println("ERROR: " + exc);
        }
        return msg;
    }

    public String getCurrentTime() {
        //String currentTime = LocalTime.now().toString(); // for myself
        //String formatTime = "";
        //for (int i = 0; currentTime.charAt(i) != '.'; i++) formatTime += currentTime.charAt(i);
        return LocalTime.now().toString();//formatTime;
    }
}
