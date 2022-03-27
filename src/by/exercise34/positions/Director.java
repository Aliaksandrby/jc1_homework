package by.exercise34.positions;

import by.exercise34.abstractpay.MixedPayable;

public class Director implements MixedPayable {

    private String surname;
    private String name;
    private String personalNumber;
    private final String warning = "неверные аргументы метода по начислению зарплаты";
    private String result;

    public Director(String name,String surname, String personalNumber) {
        setName(name);
        setSurname(surname);
        setPersonalNumber(personalNumber);
    }

    private void setName(String name) {
        checkString(name);
        this.name = name;
    }

    private void setSurname(String surname) {
        checkString(surname);
        this.surname = surname;
    }

    private void setPersonalNumber(String personalNumber) {
        checkString(personalNumber);
        this.personalNumber = personalNumber;
    }

    private void checkString(String str) {
        if(str.length() == 0) {
            System.out.println("Плохой парамер введенной строки");
            System.exit(1);
        }
    }

    @Override
    public String salaryMixed(double tariffRate, int percent, double priceProducts) {
        if(checkParametrs(tariffRate,percent,priceProducts)) {
            result = getWarning();
            return result;
        }
        double salary = tariffRate + (priceProducts*percent)/100;
        result = String.format("%.2f",salary);
        return result;
    }


    private boolean checkParametrs(double tariffRate, int percent, double priceProducts) {
        return (tariffRate <= 0) || (percent < 0) || (priceProducts <= 0);
    }

    @Override
    public String toString() {
        if(getResult() == null) {
            result = "не вызван метод по начислению зарплаты у человека с табельным номером " + getPersonalNumber();
        } else {
            result = getSurname() + " " + getName() + "\n" +
                    "табельный номер: " + getPersonalNumber() + "\n" +
                    getResult();
        }
        return result;
    }

    public String getWarning() {
        return warning;
    }

    public String getResult() {
        return result;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
