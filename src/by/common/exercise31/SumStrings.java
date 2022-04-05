package by.common.exercise31;

public class SumStrings {

    private int times;
    private String someString;

    public SumStrings(String someString,int times) {
        this.setSomeString(someString);
        this.setTimes(times);
    }

    private void setSomeString(String someString) {
        this.someString = someString;
    }

    private void setTimes(int times) {
        this.times = times;
    }

    public String sumStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < times; i++) stringBuilder.append(someString);
        return stringBuilder.toString();
    }

    public String sumString() {
        String string = "";
        for (int i = 0; i < times; i++) string += someString;
        return string;
    }
}
