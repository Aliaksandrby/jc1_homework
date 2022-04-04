package by.exercise48;

public class UserOutput {
    public static void show(TextNumber textNumber) {
        for (Double num : textNumber.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void showSum(TextNumber textNumber) {
        System.out.println("SUM = " + textNumber.sum());
    }
}
