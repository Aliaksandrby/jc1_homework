package by.exercise32.appliance.kitchen.device;

import by.exercise32.appliance.kitchen.KitchenAppliance;

public class Microwave extends KitchenAppliance {

    public Microwave(String brand, String nameKitchenAppliance) {
        super(brand, nameKitchenAppliance);
    }

    public void warmingFood() {
        System.out.println("This microwave is warming up food");
    }
}