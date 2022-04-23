package by.exercise58;

import java.util.HashMap;
import java.util.concurrent.*;

public class TenTaskPool {
    public static void start(int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        Future<HashMap<CopyOnWriteArrayList<String>,String>> t1 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t2 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t3 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t4 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t5 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t6 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t7 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t8 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t9 = executorService.submit(new Task());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> t10 = executorService.submit(new Task());

        try {
            System.out.println(t1.get());
            System.out.println(t2.get());
            System.out.println(t3.get());
            System.out.println(t4.get());
            System.out.println(t5.get());
            System.out.println(t6.get());
            System.out.println(t7.get());
            System.out.println(t8.get());
            System.out.println(t9.get());
            System.out.println(t10.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
