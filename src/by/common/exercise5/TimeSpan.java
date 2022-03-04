package by.common.exercise5;

public class TimeSpan {
    public String calcTime(int spanTimeSec) {
        if(spanTimeSec < 0) {
            return "Wrong time";
        }
        int week = spanTimeSec/(7*24*3600);
        int day = (spanTimeSec - week*7*24*3600)/(24*3600);
        int hour = (spanTimeSec - week*7*24*3600 - day*24*3600)/3600;
        int minute = (spanTimeSec - hour*3600 - week*7*24*3600 - day*24*3600)/60;
        int sec = spanTimeSec%60;
        return hour + " hours " + minute + " minutes " + sec + " seconds " + day
                + " days " + week + " weeks ";
    }
}
