/*
 * Написать метод, который выводит следующий сезон от заданного
 * во входном параметре. Входной параметр ввести с клавиатуры.
 */

package by.exercise36;

public class Main {
    public static void main(String[] args) {
        String season = ShowSeason.input();
        ShowSeason.nextSeason(season);
    }
}
