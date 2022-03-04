package by.common.exercise14;

public class Sum {
    public static int sumDigit(Long num) {
        String strNum = num.toString();
        int sum = 0;
        int count = 0;
        do {
            Character character = strNum.charAt(count);
            sum += Integer.parseInt(character.toString());
            count++;
        } while(count < strNum.length());
        return sum;
    }
}
