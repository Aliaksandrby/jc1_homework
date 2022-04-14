package by.exercise55;

public class StartThreads {
    private final int numberOfThreads;
    private final long millis;

    public StartThreads(int numberOfThreads,long millis) {
        if(numberOfThreads < 0 || millis < 0) {
            System.out.println("check millis or numberOfThreads");
            System.exit(1);
        }
        this.millis = millis;
        this.numberOfThreads = numberOfThreads;
        go();
    }

    private void go() {
        for (int i = 0; i < numberOfThreads; i++) {
            new ThreadCreator("thread " + (i+1),millis);
        }
    }
}
