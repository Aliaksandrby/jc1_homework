/*
* Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
* Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
* Иерархия должна иметь хотя бы три уровня.
* Руководство получает только смешанную, Начальник цеха(отдела) - может получить смешанную или процентную
* рабочий получает зарплату по различным видам оплаты в зависимости от рода деятельности.
*/

package by.exercise34;

import by.exercise34.positions.*;

public class Main {
    public static void main(String[] args) {
        Director aleksey = new Director("Иванов","Алексей","042589");
        aleksey.salaryMixed(1259.40,5,700);
        System.out.println(aleksey);

        DeputyDirector fedor = new DeputyDirector("Петров","Федор","069871");
        fedor.salaryMixed(1100.70,3,700);
        System.out.println(fedor);

        FactoryForeman ivan = new FactoryForeman("Кузнецов","Иван","018956");
        //ivan.salaryMixed(1100.70,3,700);
        ivan.salaryPercentage(3800.25,10);
        System.out.println(ivan);

        Employee alen = new Employee("Делон","Ален","987456");
        //alen.salaryMixed(1100.70,3,700);
        //alen.salaryPercentage(3800.25,10);
        alen.salaryHourly(15,160);
        System.out.println(alen);
    }
}
