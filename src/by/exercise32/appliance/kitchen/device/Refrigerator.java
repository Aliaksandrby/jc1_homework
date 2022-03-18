package by.exercise32.appliance.kitchen.device;

import by.exercise32.appliance.kitchen.KitchenAppliance;

public class Refrigerator extends KitchenAppliance {

    public Refrigerator(String brand, String nameKitchenAppliance) {
        super(brand, nameKitchenAppliance);
    }

    private String freeze() {
        return "and freezes anything";
    }

    @Override
    public String toString() {
        if(getState()) return super.toString() + " " + freeze();
        return super.toString();
    }
}
