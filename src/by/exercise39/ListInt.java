package by.exercise39;

import java.util.*;

public class ListInt {
    private ArrayList<Integer> list;
    private Iterator<Integer> intIterator;

    public ListInt() {
        this.list = new ArrayList<>();
    }

    public void fillRandomList(int numbers) {
        if(numbers < 1) {
            System.out.println("it can't be possible");
            return;
        }
        for (int i = 0; i < numbers; i++) {
            int randomNumber = randomIntOneToTen();
            list.add(randomNumber);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    private int randomIntOneToTen() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        int randomInt = (int)(randomDouble*10+1);
        return randomInt;
    }

    public void rmNegativeMark() {
        intIterator = list.iterator();
        while(intIterator.hasNext()) {
            Integer nextElement = intIterator.next();
            if(nextElement < 4) {
                intIterator.remove();
            }
        }
    }

    public void rmRepeatNumbers() {
        intIterator = list.iterator();
        while (intIterator.hasNext()) {
            Integer element = intIterator.next();
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if(element.equals(list.get(i))) {
                    count++;
                }
                if(count > 1) {
                    intIterator.remove();
                    break;
                }
            }
        }
    }

    public int maxMark() {
        intIterator = list.iterator();
        Integer max = list.get(0);
        while (intIterator.hasNext()) {
            Integer element = intIterator.next();
            if(max < element) {
                max = element;
            }
        }
        return max;
    }
}
