package by.exercise39;

public class Console {
    public static void showList(ListInt listInt) {
        for (Integer element : listInt.getList()) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void showMark(int maxMark) {
        System.out.println("Max value = " + maxMark);
    }
}
