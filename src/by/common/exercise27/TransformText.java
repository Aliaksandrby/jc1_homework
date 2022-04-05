package by.common.exercise27;

public class TransformText {
    public String[] textToWordArray(String str) {
        String[] arrayString = str.split("[ (,!:;?).-]");
        String temp = "";
        for (String element : arrayString) if(!element.equals("")) temp += element + " ";
        return temp.split(" ");
    }
}
