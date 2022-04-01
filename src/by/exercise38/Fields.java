package by.exercise38;

import java.util.*;

public class Fields {

    private String name;
    private String color;

    public Car car() {
        System.out.print("Введите модель автомобиля: ");
        input();
        return new Car(name,color);
    }

    public Motorcycle moto() {
        System.out.print("Введите модель мотоцикла: ");
        input();
        return new Motorcycle(name,color);
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.print("введите цвет: ");
        color = scanner.next();
    }
}
