package by.common.exercise24;

public class TimeInterval implements Comparable<TimeInterval> {

    private int hour;
    private int minute;
    private int sec;

    public TimeInterval(int sec) {
        this.setAllSeconds(sec);
    }

    public TimeInterval(int hour,int minute,int sec) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSec(sec);
    }

    private void checkInt(int number) {
        if(number < 0) {
            System.out.println("Wrong data!!!");
            System.exit(1);
        }
    }

    private void checkMinuteSecond(int number) {
        if(number > 59) {
            System.out.println("Wrong data!!!");
            System.exit(1);
        }
    }


    public void setHour(int hour) {
        checkInt(hour);
        this.hour = hour;
    }
    public void setMinute(int minute) {
        checkInt(minute);
        checkMinuteSecond(minute);
        this.minute = minute;
    }

    public void setSec(int sec) {
        checkInt(sec);
        checkMinuteSecond(sec);
        this.sec = sec;
    }

    public void setAllSeconds(int secAll) {
        checkInt(secAll);
        this.hour = secAll/3600;
        this.minute = (secAll - hour*3600)/60;
        this.sec = secAll - hour * 3600 - minute * 60;
    }

    public int getAllTimeInObject() {
        return hour*3600+minute*60+sec;
    }

    public int compareTo(TimeInterval value) {
        if(this.getAllTimeInObject() == value.getAllTimeInObject()) return 0;
        if(this.getAllTimeInObject() < value.getAllTimeInObject()) {
            return -1;
        } else {
            return 1;
        }
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSec() {
        return sec;
    }

    public String toString() {
        return hour + " h " + minute + " m " + sec + " s";
    }
}