package by.exercise32.appliance.kitchen;

import by.exercise32.appliance.Appliance;

public class KitchenAppliance extends Appliance {
    private String nameKitchenAppliance;

    public KitchenAppliance(String brand) {
        super(brand);
    }

    public KitchenAppliance(String brand, String nameKitchenAppliance) {
        this(brand);
        this.setNameKitchenAppliance(nameKitchenAppliance);
    }

    private void setNameKitchenAppliance(String nameKitchenAppliance) {
        this.nameKitchenAppliance = nameKitchenAppliance;
    }

    @Override
    public String toString() {
        return nameKitchenAppliance + super.toString();
    }
}