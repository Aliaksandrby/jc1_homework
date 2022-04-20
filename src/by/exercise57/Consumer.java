package by.exercise57;

public class Consumer implements Runnable{
    private final Thread thread;
    private final Queue queue;

    public Consumer(String threadName, Queue queue) {
        this.thread = new Thread(this,threadName);
        this.queue = queue;
        this.thread.start();
    }

    @Override
    public void run() {
        while (Queue.isContinued) {
            queue.delEl(thread.getName(),80,10000);  // 8 50
        }
    }
}
