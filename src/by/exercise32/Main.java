/*
 *Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

package by.exercise32;

import by.exercise32.appliance.Appliance;
import by.exercise32.appliance.kitchen.device.*;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        appliance = new CoffeeMachine("Philips","coffee machine");
        appliance.turnOn();
        System.out.println(appliance);

        appliance = new Microwave("Samsung","microwave");
        //appliance.turnOn();
        System.out.println(appliance);

        appliance = new Refrigerator("LG","refrigerator");
        appliance.turnOn();
        System.out.println(appliance);
    }
}