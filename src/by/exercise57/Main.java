/*
* Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
* Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100,
* а потребители берут эти числа. Если в очереди элементов  >=  100 производители спят,
* если нет элементов в очереди - потребители спят. Если элементов стало <= 80,
* производители просыпаются. Все это работает до тех пор, пока обработанных элементов
* не станет 10 000, только потом программа завершается.
*/

package by.exercise57;

public class Main {
    public static void main(String[] args) {

    }
}
