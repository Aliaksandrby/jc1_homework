package by.common.exercise29;

public class Search {
    public static void findHex(String inputLine) {
        String[] words = inputLine.split("( |-)");
        String regExHex = "\\p{XDigit}+"; // the same [0-9a-fA-F];
        String markHex = "0(x|X)";
        String regExpression = markHex+ regExHex +"\\."+regExHex+'|'+markHex + regExHex;
        for (String word: words) {
            //if(word.matches("0(x|X)[0-9a-fA-F]+\\.[0-9a-fA-F]+|0(x|X)[0-9a-fA-F]+")) System.out.println(word);
            if(word.matches(regExpression)) System.out.println(word);
        }
    }
}
