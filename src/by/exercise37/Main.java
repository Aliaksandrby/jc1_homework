/*
* Написать метод, который в зависимости от сезона, выводит на экран сумму
* дней в этом сезоне. Входной параметр ввести с клавиатуры.
*/

package by.exercise37;

import by.exercise36.ShowSeason;

public class Main {
    public static void main(String[] args) {
        String season = ShowSeason.input();
        ShowSeason.showSumOfDays(season);
    }
}
