package by.exercise38;

public class Car extends Vehicle {

    private final int numbersOfDoors = 4;

    public Car(String name, String color) {
        super(name, color);
    }

    public  void getInTheCar() {
        // TODO: we can create this method;
    }

     public void engageReverseGear() {
        //TODO: on reverse gear;
     }

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }
}
