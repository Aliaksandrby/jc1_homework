package by.exercise38;

public class Motorcycle extends Vehicle {

    final private boolean helmet = true;

    public Motorcycle(String name, String color) {
        super(name, color);
    }

    public boolean isHelmet() {
        return helmet;
    }
}
