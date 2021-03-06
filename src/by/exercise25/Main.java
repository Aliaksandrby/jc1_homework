/*Создать класс описывающий банкомат. Набор купюр, находящихся в банкомате, должен
 * задаться тремя свойствами: количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег
 * в банкомат. Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
 * На экран - булевское значение (операция удалась или нет). При снятии денег метод должен
 * выводить на экран каким количеством купюр и какого номинала выдается сумма. Создать конструктор с тремя параметрами
 *  - количеством купюр.*/
package by.exercise25;

import by.exercise25.shape.*;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(4,5,5);
        String input = GetData.defaultData();
        GetData.getMoney(input, atm);
        GetData.addMoney(input, atm);
    }
}