package by.exercise34.positions;

import by.exercise34.abstractpay.PercentPayable;

public class FactoryForeman extends DeputyDirector implements PercentPayable {

    private String result;

    public FactoryForeman(String name, String surname, String personalNumber) {
        super(name, surname, personalNumber);
    }

    @Override
    public String salaryMixed(double tariffRate, int percent, double priceProducts) {
        result = super.salaryMixed(tariffRate, percent, priceProducts);
        return result;
    }

    @Override
    public String salaryPercentage(double priceProducts, int percent) {
        if(checkParametrs(priceProducts,percent)) {
            result = getWarning();
            return result;
        }
        double salary = (priceProducts*percent)/100;
        result = String.format("%.2f",salary);
        return result;
    }

    private boolean checkParametrs(double priceProducts, int percent) {
        return (priceProducts <= 0) || (percent <= 0);
    }

    @Override
    public String getResult() {
        return result;
    }
}
