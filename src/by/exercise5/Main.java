/*
* Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран
* в виде часов минут и секунд, суток и недель.
*/

package by.exercise5;

import by.common.exercise5.TimeSpan;

public class Main {
    public static void main(String[] args) {
        // 19 hours 59 minutes 9 seconds 2 days 9 weeks
        String out = new TimeSpan().calcTime(5687949);
        System.out.println(out);
    }
}
