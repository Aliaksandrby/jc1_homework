package by.exercise56;

public class DeadLock {
    private final SomeObject object1;
    private final SomeObject object2;
    private final SomeObject object3;

    public DeadLock() {
        this.object1 = new SomeObject("object 1");
        this.object2 = new SomeObject("object 2");
        this.object3 = new SomeObject("object 3");
        startThreads();
    }

    private void first() {
        synchronized (object1) {
            String addStr = Thread.currentThread().getName();
            System.out.println(addStr + " first() synchronized object 1");
            synchronized (object2) {
                System.out.println(object2);
            }
        }
    }

    private void second() {
        synchronized (object2) {
            String addStr = Thread.currentThread().getName();
            System.out.println(addStr + " second() synchronized object 2");
            synchronized (object1) {
                System.out.println(object1);
            }
        }
    }

    private void third() {
        synchronized (object3) {
            String addStr = Thread.currentThread().getName();
            System.out.println(addStr + " third() synchronized object 3");
            synchronized (object2) {
                System.out.println(object2);
            }
        }
    }

    private void startThreads() {
        new Thread(() -> first()).start();
        new Thread(() -> second()).start();
        new Thread(() -> third()).start();
    }
}
