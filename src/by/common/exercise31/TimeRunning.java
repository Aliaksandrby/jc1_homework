package by.common.exercise31;

public class TimeRunning {
    public static void checkTimeRunningString(SumStrings sumStrings) {
        long tStart = System.currentTimeMillis();
        sumStrings.sumString();
        long tEnd = System.currentTimeMillis();
        System.out.println("String = " + (tEnd-tStart));
    }

    public static void checkTimeRunningStringBuilder(SumStrings sumStrings) {
        long tStart = System.currentTimeMillis();
        sumStrings.sumStringBuilder();
        long tEnd = System.currentTimeMillis();
        System.out.println("StringBuilder = " + (tEnd-tStart));
    }
}

// String = 1397762
// StringBuilder = 36
