package by.exercise52;

public class CounterThreads {
    private final int numberOfThreads;

    public CounterThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    public void begin() {
        CollectionList collectionList = new CollectionList(10);
        for (int i = 0; i < numberOfThreads; i++) {
            new ThreadCreator("thread " + (i+1), collectionList.generateList());
        }
    }
}
