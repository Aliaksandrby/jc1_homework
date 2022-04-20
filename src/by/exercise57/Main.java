/*
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
 * Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100,
 * а потребители берут эти числа. Если в очереди элементов >= 100 производители спят,
 * если нет элементов в очереди - потребители спят. Если элементов стало <= 80,
 * производители просыпаются. Все это работает до тех пор, пока обработанных элементов
 * не станет 10 000, только потом программа завершается.
 *
 * Producer - производитель
 * Consumer - потребитель
 * Очередь - первый пришел, первый обслужен
 *
 */

package by.exercise57;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(200);
        System.out.println(queue);
        new Producer("Producer-1",queue);
        new Producer("Producer-2",queue);
        new Producer("Producer-3",queue);
        new Consumer("Consumer-1",queue);
        new Consumer("Consumer-2",queue);
    }
}
