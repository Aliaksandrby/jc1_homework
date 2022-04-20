package by.exercise57;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Queue {
    private final CopyOnWriteArrayList<Integer> elements;
    public int counter;
    public static boolean isContinued = true;

    public Queue(int capacity) {
        this.elements = new CopyOnWriteArrayList<>();
        setQueue(capacity);
    }

    public synchronized void addEl(String nameThread,int c) {
        while(elements.size() >= c) {
            try {
                wait();
            } catch (InterruptedException exc) {
                System.out.println("check wait() of addEl(): " + exc);
            }
        }

        elements.add(getRandomNumber());
        System.out.println(this + " : " + nameThread);

        sleep(100);

        notifyAll();
    }

    public synchronized void delEl(String nameThread,int c,int count) {
        if(elements.size() == 0) {
            System.out.println("queue is empty");
            System.exit(1);
        }

        while(elements.size() <= c) {
            try {
                wait();
            } catch (InterruptedException exc) {
                System.out.println("check wait() of delEl(): " + exc);
            }
        }

        counter++;
        if(counter > count) {
            isContinued = false;
            System.exit(0);
        }
        elements.remove(0);
        System.out.println(this + " : " + nameThread + " : " + counter);

        sleep(100);

        notifyAll();
    }

    private int getRandomNumber() {
        return (int)(new Random().nextDouble()*100 + 1);
    }

    private void setQueue(int capacity) {
        if(capacity < 1) {
            System.out.println("Queue is empty, check capacity");
            System.exit(1);
        }
        for (int i = 0; i < capacity; i++) {
            elements.add(getRandomNumber());
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException exc) {
            System.out.println("check Thread.sleep() of delEl(): " + exc);
        }
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
