package by.exercise55;

public class ThreadCreator implements Runnable {
    private final Thread thread;
    private final long millis;

    public ThreadCreator(String threadName,long millis) {
        this.millis = millis;
        this.thread = new Thread(this,threadName);
        this.thread.start();
    }

    @Override
    public void run() {
        PrintThread.printName(this.toString(),millis);
    }

    @Override
    public String toString() {
        return thread.getName();
    }
}
