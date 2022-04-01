/*
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
 * Создать поле name в классе Vehicle и проинициализировать его через конструктора.
 * Создать generic класс Garage, который может хранить только объекты типа
 * наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с клавиатуры)
 * и вывести на экран имя хранимого транспортного средства.
 */

package by.exercise38;

public class Main {
    public static void main(String[] args) {
        Garage<Car> car = new Garage<>(new Fields().car());
        ToConsole.vehicleGarage(car);

        Garage<Motorcycle> moto = new Garage<>(new Fields().moto());
        ToConsole.vehicleGarage(moto);
    }
}
