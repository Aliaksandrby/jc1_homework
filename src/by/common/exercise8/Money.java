package by.common.exercise8;

public class Money {
    public void checkByn(int byn) {
        if(byn < 0) {
            System.out.println("Вы кому - то задолжали");
            return;
        }
        if((byn % 10) == 1 && byn > 11 || byn == 1) {
            System.out.println(byn + " рубль");
        }else if(((byn % 10) == 2 || (byn % 10) == 3 || (byn % 10) == 4) && byn > 14 ||
                byn == 2 || byn == 3 || byn == 4) {
            System.out.println(byn + " рубля");
        } else {
            System.out.println(byn + " рублей");
        }
    }
}
