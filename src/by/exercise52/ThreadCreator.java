package by.exercise52;

import java.util.List;

public class ThreadCreator implements Runnable {

    private final Thread thread;
    private final List<Integer> list;

    public ThreadCreator(String threadName, List<Integer> list) {
        thread = new Thread(this,threadName);
        this.list = list;
        thread.start();
    }

    public void run() {
        User.show(thread.getName(),averageArithmetic(list));
    }

    private double averageArithmetic(List<Integer> list) {
        return sum(list)/list.size();
    }

    private double sum(List<Integer> list) {
        if(list == null) {
            return 0.0;
        }
        double sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }
}
