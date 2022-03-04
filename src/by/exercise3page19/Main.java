/*
* Написать код, который выведет на экран:
* byte b = 0x55; short s = 0x55ff; int i = 1000000;
* long l = 0xffffffffL; char c = 'a'; float f = .25F;
* double d = .00001234; boolean bool = true;
*/

package by.exercise3page19;

import by.common.exercise3page19.HelperArgs;
import by.common.OutData;

public class Main {
    public static void main(String[] args) {
        HelperArgs helperArgs = new HelperArgs();
        new OutData().outPut(helperArgs);
    }
}
