package by.exercise36;

import by.exercise35.YearSeason;
import java.util.Scanner;

public class ShowSeason {

    public static String input() {
        greet();
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toUpperCase();
    }

    private static void greet() {
        System.out.print("Введите сезон года winter,spring,summer,autumn: ");
    }

    public static void nextSeason(String season) {
        String nextSeason = "следующий сезон: ";
        YearSeason yearSeason = stringToEnum(season);
        negativeInfo(yearSeason);
        if(yearSeason.ordinal() == YearSeason.values().length-1) {
            nextSeason  += YearSeason.values()[0];
        } else {
            nextSeason  += YearSeason.values()[yearSeason.ordinal()+1];
        }
        System.out.println(nextSeason);
    }

    public static void showSumOfDays(String season) {
        YearSeason yearSeason = stringToEnum(season);
        negativeInfo(yearSeason);
        System.out.println(yearSeason + " - сумма дней: " + yearSeason.getCountOfDays());
    }

    private static boolean checkNull(YearSeason yearSeason) {
        return yearSeason == null;
    }

    private static void negativeInfo(YearSeason yearSeason) {
        if(checkNull(yearSeason)) {
            System.out.println("нет такого сезона");
            System.exit(0);
        }
    }

    private static YearSeason stringToEnum(String season) {
        switch (season) {
            case "WINTER": return YearSeason.WINTER;
            case "SPRING": return YearSeason.SPRING;
            case "SUMMER": return YearSeason.SUMMER;
            case "AUTUMN": return YearSeason.AUTUMN;
            default: return null;
        }
    }
}
