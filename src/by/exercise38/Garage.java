package by.exercise38;

public class Garage<V extends Vehicle> {

    private static int count;

    private final V vehicle;

    public Garage(V vehicle) {
        count++;
        this.vehicle = vehicle;
    }

    public V getVehicle() {
        return vehicle;
    }

    public static int getCount() {
        return count;
    }
}
