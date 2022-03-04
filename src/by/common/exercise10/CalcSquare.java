package by.common.exercise10;

public class CalcSquare {
    public boolean checkSquare(AreaData arguments) {
        double squareHouse1 = arguments.getA() * arguments.getB();
        double squareHouse2 = arguments.getC() * arguments.getD();
        double squareArea = arguments.getE() * arguments.getF();
        return squareArea >= (squareHouse1 + squareHouse2);
    }
}
