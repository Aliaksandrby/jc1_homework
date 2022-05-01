/*
* Задать произвольное целое число и вывести его в бухгалтерском, то есть, начиная справа,
* каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено
* 20 023 143
*/

package by.exercise17;

public class Main {
    public static void main(String[] args) {
        //System.out.println(String.format("%,d",2002314));
        System.out.println(Accountant.format(-51233255));
    }
}

class Accountant {
    public static <T extends Number> String format(T number) {
        String str = number.toString();
        String newStr = "";
        int i = str.length();
        int count = 0;
        do {
            count++;
            if(count == 4) {
                newStr += ' ';
                count = 1;
            }
            i--;
            newStr += str.charAt(i);
        } while (i != 0);
        newStr = revers(newStr);
        return newStr;
    }

    private static String revers(String string) {
        String str = "";
        int i = string.length();
        do {
            i--;
            str += string.charAt(i);
        } while (i != 0);
        return str;
    }
}
