package by.common.exercise6;

public class CheckNumber {
    public boolean isLastDigitSeven(int num) {
        Integer number = num;
        String str = number.toString();
        return str.charAt(str.length()-1) == '7';
    }
}
