package by.common.exercise21;

public class OnScreen {

    public static void showArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static String outData(int[] array,int[] arrayIndexesMin,int[] arrayIndexesMax) {
        int firstIndexMin = arrayIndexesMin[0];
        int lastIndexMin = arrayIndexesMin[arrayIndexesMin.length-1];
        int firstIndexMax = arrayIndexesMax[0];
        int lastIndexMax = arrayIndexesMax[arrayIndexesMax.length-1];
        String out = "sum = ";
        if(Math.abs(firstIndexMin-lastIndexMax) == Math.abs(lastIndexMin-firstIndexMax)) {
            if(arrayIndexesMin.length == 1 && arrayIndexesMax.length == 1) {
                out += Array.sumElementArrayInt(array,firstIndexMin,firstIndexMax).toString();
            } else {
                out += Array.sumElementArrayInt(array,firstIndexMin,lastIndexMax).toString() + "\n" +
                        "sum2 = " + Array.sumElementArrayInt(array,firstIndexMax,lastIndexMin).toString();
            }
        } else if(Math.abs(firstIndexMin-lastIndexMax) < Math.abs(lastIndexMin-firstIndexMax)) {
            out += Array.sumElementArrayInt(array,lastIndexMin,firstIndexMax).toString();
        } else {
            out += Array.sumElementArrayInt(array,firstIndexMin,lastIndexMax).toString();
        }
        return out;
    }
}
