package by.exercise38;

public class ToConsole {
    public static void vehicleGarage(Garage<?> vehicle) {
        System.out.println("В гараже №" + Garage.getCount() + ": " + vehicle.getVehicle().getName());
        //System.out.println("цвет: " + vehicle.getVehicle().getColor());
        System.out.println();
    }
}
