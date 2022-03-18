/*
 * Напишите два цикла выполняющих миллион сложений строк вида  "aaabbbccc",
 * один с помощью оператора сложения и String, а другой с помощью StringBuilder
 * и метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */

package by.exercise31;

import by.common.exercise31.*;

public class Main {

    public static void main(String[] args) {
        SumStrings sumStrings = new SumStrings("aaabbbccc",1_000_000);
        TimeRunning.checkTimeRunningString(sumStrings);
        TimeRunning.checkTimeRunningStringBuilder(sumStrings);
    }
}
