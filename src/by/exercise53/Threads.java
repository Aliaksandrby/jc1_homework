package by.exercise53;

public class Threads {

    private final int numberOfThreads;
    private final int sizeArray;
    private final String threadName;

    public Threads(int numberOfThreads,String threadName,int sizeArray) {
        this.numberOfThreads = numberOfThreads;
        this.sizeArray = sizeArray;
        this.threadName = threadName;
    }

    public void go() {
        for (int i = 0; i < numberOfThreads; i++) {
            new ThreadGeneratingArrayNumbers(threadName + " " + (i + 1),sizeArray);
        }
    }
}
