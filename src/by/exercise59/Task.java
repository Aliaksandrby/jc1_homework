package by.exercise59;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task implements Callable<String> {

    private int generateNumber() {
        return (int)(new Random().nextDouble()*10);
    }

    private void sleepFromTo(int a,int b) {
        try {
            Thread.sleep((long)(Math.random()*(b-a)+a));
        } catch(InterruptedException exc) {
            System.out.println("something went wrong with your Thread.sleep()");
        }
    }

    private String generateCollection() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) list.add(generateNumber());
        String threadName = Thread.currentThread().getName();
        int sum = sumCollection(list);
        sleepFromTo(1000,10000);
        return "threadName: " + threadName + " | sum: " + sum;
    }

    private Integer sumCollection(CopyOnWriteArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) sum += element;
        return sum;
    }

    @Override
    public String call() {
        return generateCollection();
    }
}
