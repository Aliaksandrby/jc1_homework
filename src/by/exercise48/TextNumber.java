package by.exercise48;

import java.util.ArrayList;
import java.util.Iterator;

public class TextNumber {
    private final ArrayList<Double> numbers;
    private double sum;

    public TextNumber() {
        this.numbers = new ArrayList<>();
    }

    public void findNumbers(ArrayList<String> listStr, String regex) {
        for (String str : listStr) {
            if(str.matches(regex)) numbers.add(Double.parseDouble(str.replace(",",".")));
        }
    }

    public void removeRepeatNumbers() {
        Iterator<Double> doubleIterator = numbers.iterator();
        while (doubleIterator.hasNext()) {
            Double element = doubleIterator.next();
            int count = 0;
            for (Double number : numbers) {
                if (element.equals(number)) {
                    count++;
                }
                if (count > 1) {
                    doubleIterator.remove();
                    break;
                }
            }
        }
    }

    public double sum() {
        for (Double num : getNumbers()) sum += num;
        return sum;
    }

    public ArrayList<Double> getNumbers() {
        return numbers;
    }
}
