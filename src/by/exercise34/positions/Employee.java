package by.exercise34.positions;

import by.exercise34.abstractpay.HourPayable;

public class Employee extends FactoryForeman implements HourPayable {
    private String result;

    public Employee(String name, String surname, String personalNumber) {
        super(name, surname, personalNumber);
    }

    @Override
    public String salaryMixed(double tariffRate, int percent, double priceProducts) {
        result = super.salaryMixed(tariffRate, percent, priceProducts);
        return result;
    }

    @Override
    public String salaryPercentage(double priceProducts, int percent) {
        result = super.salaryPercentage(priceProducts, percent);
        return result;
    }

    @Override
    public String salaryHourly(double priceOneHour, int numberOfHours) {
        if(checkParametrs(priceOneHour,numberOfHours)) {
            result = getWarning();
            return result;
        }
        double salary = priceOneHour*numberOfHours;
        result = String.format("%.2f",salary);
        return result;
    }

    private boolean checkParametrs(double priceOneHour, int numberOfHours) {
        return (priceOneHour <= 0) || (numberOfHours < 0);
    }

    @Override
    public String getResult() {
        return result;
    }
}
