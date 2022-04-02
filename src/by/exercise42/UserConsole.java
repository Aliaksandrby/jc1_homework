package by.exercise42;

public class UserConsole {

    public static void showMap(TextMap textMap) {
        //TODO: we can create output textMap using foreach but it isn't necessary;
        System.out.println(textMap.getTextMap());
    }

    public static void invite() {
        System.out.println("Input text, the end of the text - '@':");
    }
}
