package by.exercise32.appliance.kitchen;

import by.exercise32.appliance.Appliance;

public class KitchenAppliance extends Appliance {

    private String nameKitchenAppliance;
    public final static String location = "kitchen";
    public String color;

    public KitchenAppliance(String brand) {
        super(brand);
    }

    public KitchenAppliance(String brand, String nameKitchenAppliance, String color) {
        this(brand);
        this.setNameKitchenAppliance(nameKitchenAppliance);
        this.setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void setNameKitchenAppliance(String nameKitchenAppliance) {
        this.nameKitchenAppliance = nameKitchenAppliance;
    }

    @Override
    public String toString() {
        return nameKitchenAppliance + super.toString();
    }
}