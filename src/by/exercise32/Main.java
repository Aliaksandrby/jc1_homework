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


        CoffeeMachine coffeeMachine = new CoffeeMachine("Philips","coffee machine",
                "red");
        coffeeMachine.turnOn();
        coffeeMachine.setVolume(2);
        coffeeMachine.makeCoffee();

        Microwave microwave = new Microwave("Samsung","microwave","white",
                20,30);
       // microwave.turnOn();
        microwave.setFood("some food");
        microwave.warmingFood();

    }
}