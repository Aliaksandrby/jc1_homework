package by.exercise32.appliance.kitchen.device;

import by.exercise32.appliance.kitchen.KitchenAppliance;

public class CoffeeMachine extends KitchenAppliance {

    private double volume;

    public CoffeeMachine(String brand, String nameKitchenAppliance, String color) {
        super(brand, nameKitchenAppliance,color);
    }

    public void setVolume(double volume) {
        if(volume <= 0) return;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void makeCoffee() {
        if(getState() && getVolume() > 0) System.out.println("This coffee machine is making coffee");
        else System.out.println("turn on coffee machine or add water");
    }
}