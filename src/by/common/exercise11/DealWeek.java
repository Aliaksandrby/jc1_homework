package by.common.exercise11;

public class DealWeek {
    public String deal(int number) {
        if(number < 0) return "wrong day of a week!!!";
        String str;
        switch (number) {
            case 1:
                str = "Закупить продукты питания на неделю";
                break;
            case 2:
                str = "Зделать задания по курсу Java";
                break;
            case 3:
                str = "Сходить в кино на кинопремьеру";
                break;
            case 4:
                str = "Посетить картинную галерею";
                break;
            case 5:
                str = "Сходить в аквапарк";
                break;
            case 6:
                str = "Сходить к другу на день раждения";
                break;
            case 7:
                str = "День лечения после дня рождения";
                break;
            default:
                str = "Неверный день недели";
                break;
        }
        return str;
    }
}
