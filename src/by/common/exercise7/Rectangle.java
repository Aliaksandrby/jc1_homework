package by.common.exercise7;

public class Rectangle {
    public boolean isCovers(int a, int b, int r) {
        if(a < 0 || b < 0 || r < 0) {
            System.out.println("Negative! Try one more time.");
            return false;
        }
        double d = Math.hypot((double) a, (double) b);
        return d <= 2*r;
    }
}
