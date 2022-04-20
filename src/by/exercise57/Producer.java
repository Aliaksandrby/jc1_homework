package by.exercise57;

public class Producer implements Runnable{
    private final Thread thread;
    private final Queue queue;

    public Producer(String threadName, Queue queue) {
        this.thread = new Thread(this,threadName);
        this.queue = queue;
        this.thread.start();
    }

    @Override
    public void run() {
        while (Queue.isContinued) {
            queue.addEl(thread.getName(),100); // 10
        }
    }
}
