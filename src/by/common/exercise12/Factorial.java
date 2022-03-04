package by.common.exercise12;

public class Factorial {
    public static int findFactorial(int num) {
        if(num < 0) return -1;
        if(num == 0 || num == 1) return 1;
        int count = 2;
        int fact = 1;
        while (count <= num) {
            fact *= count;
            count++;
        }
        return fact;
    }
}
