package by.exercise32.appliance.kitchen.device;

import by.exercise32.appliance.kitchen.KitchenAppliance;

public class Microwave extends KitchenAppliance {

    private double height;
    private double width;
    private String food = "";

    public Microwave(String brand, String nameKitchenAppliance,String color,double width,double height) {
        super(brand, nameKitchenAppliance,color);
        this.setHeight(width);
        this.setWidth(height);
    }

    public void setFood(String food) {
        if(food.length() == 0) return;
        this.food = food;
    }

    private void setHeight(double height) {
        if(checkSize(height)) return;
        this.height = height;
    }

    private void setWidth(double width) {
        if(checkSize(width)) return;
        this.width = width;
    }

    private boolean checkSize(double num) {
        if(num > 50 || num <= 1) {
            System.out.println("Bad microwave");
            return true;
        }
        return false;
    }

    private boolean isFood(String food) {
        if(food.length() == 0) return true;
        return false;
    }

    public void warmingFood() {
        if(getState() && !isFood(food)) System.out.println("This microwave is warming up food");
        else System.out.println("add food or turn on microwave");
    }
}