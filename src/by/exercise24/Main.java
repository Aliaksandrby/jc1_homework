/*
 * Создать клас описывающий промежуток времени. Сам промежуток в классе должен задаваться
 * тремя свойствами: секундами, минутами, часами. Сделать методы для получения полного
 * количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично
 * compareTo в строках). Создать два конструктора:
 * 1. получающий общее количество секунд.
 * 2. получающий часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */
package by.exercise24;


import by.common.exercise24.TimeInterval;

public class Main {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(9525);
        System.out.println(timeInterval);

        TimeInterval timeInterval1 = new TimeInterval(9525);
        System.out.println(timeInterval1);

        TimeInterval timeInterval2 = new TimeInterval(1000000);
        System.out.println(timeInterval2);

        System.out.println(timeInterval.compareTo(timeInterval1));
        System.out.println(timeInterval.compareTo(timeInterval2));
        System.out.println(timeInterval2.compareTo(timeInterval1));

        TimeInterval timeInterval3 = new TimeInterval(2,100,16);
        System.out.println(timeInterval3.getAllTimeInObject());
        System.out.println(timeInterval3);

        TimeInterval timeInterval4 = new TimeInterval(3,10,5);
        System.out.println(timeInterval3.compareTo(timeInterval4));
        System.out.println(timeInterval4);
    }
}
