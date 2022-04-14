package by.exercise55;

public class PrintThread {
    public synchronized static void printName(String nameThread,long millis) {
        System.out.println(nameThread);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exc) {
            System.out.println("Something went wrong with your thread: " + exc);
        }
    }
}
