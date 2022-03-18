package by.exercise32.appliance.kitchen.device;

import by.exercise32.appliance.kitchen.KitchenAppliance;

public class CoffeeMachine extends KitchenAppliance {

    public CoffeeMachine(String brand, String nameKitchenAppliance) {
        super(brand, nameKitchenAppliance);
    }

    public void makeCoffee() {
        System.out.println("This coffee machine is making coffee");
    }
}