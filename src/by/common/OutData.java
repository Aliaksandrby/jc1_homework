package by.common;

import by.common.exercise3page19.HelperArgs;
import by.common.exercise8.Money;
import java.time.LocalDate;

public class OutData {
    public void outPut(HelperArgs args) {
        System.out.println("byte b == " + args.b);
        System.out.println("short s == " + args.s);
        System.out.println("int i == " + args.i);
        System.out.println("long l == " + args.l);
        System.out.println("char c == " + args.c);
        System.out.println("float f == " + args.f);
        System.out.println(String.format("double d == %.8f",args.d));
        System.out.println("boolean bool == " + args.bool);
    }

    public void outMoney(Money money,int iteration) {
        if(iteration < 1) {
            System.out.println("iteration is too small");
            return;
        }
        for (int count = 0;count < iteration;count++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException exc) {
                System.out.println("Something went wrong!! " + exc);
            }
            money.checkByn(count);
        }
    }

    public String outPutDay(LocalDate date) {
        return date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear();
    }

    public void outCheckSquare(boolean bool) {
        if(bool) {
            System.out.println("помещается");
        } else {
            System.out.println("не помещается");
        }
    }
}
