package by.common.exercise30;

public class ChangeSubstring {
    public static StringBuilder replaceParagraph(String input) {
        String[] splitInput = input.split("<p.*?>");
        StringBuilder out = new StringBuilder("");
        for (int i = 0; i < splitInput.length; i++) {
            if(i > 0) out.append("<p>" + splitInput[i]);
        }
        return out;
    }
}
