package by.common.exercise26;

public class Marks {
    private int countMark(String mark,StringBuilder stringBuilder) {
        int count = 0;
        int i = 0;
        while(true) {
            i = stringBuilder.indexOf(mark,i++);
            if(i == -1) break;
            stringBuilder.replace(i,i+mark.length(),new String(new char[mark.length()]));
            count++;
        }
        return count;
    }

    public int counterMarks(String[] marks, String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        int counter = 0;
        for (int i = 0; i < marks.length; i++) {
            counter += countMark(marks[i],stringBuilder);
        }
        return counter;
    }
}
