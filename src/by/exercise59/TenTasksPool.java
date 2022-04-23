package by.exercise59;

import java.util.concurrent.*;

public class TenTasksPool {
    public static void start(int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        Future<String> t1 = executorService.submit(new Task());
        Future<String> t2 = executorService.submit(new Task());
        Future<String> t3 = executorService.submit(new Task());
        Future<String> t4 = executorService.submit(new Task());
        Future<String> t5 = executorService.submit(new Task());
        Future<String> t6 = executorService.submit(new Task());
        Future<String> t7 = executorService.submit(new Task());
        Future<String> t8 = executorService.submit(new Task());
        Future<String> t9 = executorService.submit(new Task());
        Future<String> t10 = executorService.submit(new Task());

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
