package by.exercise35;

import java.time.LocalDate;

public enum YearSeason {
    WINTER("снег, мороз, короткий световой день",LocalDate.now().lengthOfYear() - 275),
    SPRING("таяние снега, солнце, тепло",92),
    SUMMER("жара, отдых, шашлык",92),
    AUTUMN("листопад, дожди, похолодание",91);

    private final String description;
    private final int countOfDays;

    YearSeason(String description,int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void showConstEnum() {
        for (YearSeason ys : YearSeason.values()) {
            System.out.println(ys + " - " + ys.getDescription() + " : количество дней = " + ys.getCountOfDays());
        }
    }
}

