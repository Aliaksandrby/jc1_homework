package by.exercise32.appliance;

public class Appliance {
    private boolean turn;
    private String brand;

    public Appliance(String brand) {
        this.setBrand(brand);
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        this.turn = true;
    }

    public void turnOff() {
        this.turn = false;
    }

    public boolean getState() {
        return turn;
    }

    private String getBrand() {
        return brand;
    }

    public String toString() {
        String turnOff = "off";
        if(getState()) turnOff = "on";
        return " " + getBrand() + " is turning " + turnOff;
    }
}