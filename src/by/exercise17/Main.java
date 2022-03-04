/*
* Задать произвольное целое число и вывести его в бухгалтерском, то есть, начиная справа,
* каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено
* 20 023 143
*/

package by.exercise17;

public class Main {
    public static void main(String[] args) {
        int number = 20023143;
        String str = String.format("%,d",number);
        System.out.println(str);
    }
}
