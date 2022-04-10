package by.exercise52;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionList {
    private int sizeCollection;

    public CollectionList(int sizeCollection) {
        setSizeCollection(sizeCollection);
    }

    private void setSizeCollection(int sizeCollection) {
        if(sizeCollection < 1) {
            System.out.println("Wrong size the collection");
            System.exit(1);
        }
        this.sizeCollection = sizeCollection;
    }

    public List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeCollection; i++) {
            list.add(generateNumber());
        }
        return list;
    }

    private int generateNumber() {
        return (int)(new Random().nextDouble()*10);
    }
}
