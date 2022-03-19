package by.exercise25.shape;

import java.util.HashMap;

public class Atm {

    private int numOfBill100;
    private int numOfBill50;
    private int numOfBill20;

    public Integer[] denomination = {100,50,20};
    public Integer[] numOfBanknote = new Integer[3];

    private HashMap<Integer,Integer> getMoney;

    public Atm(int numOfBill100,int numOfBill50,int numOfBill20) {
        this.setNumOfBill100(numOfBill100);
        this.setNumOfBill50(numOfBill50);
        this.setNumOfBill20(numOfBill20);
        this.setNumOfBanknote();
    }

    private void setNumOfBanknote() {
        numOfBanknote[0] = getNumOfBill100();
        numOfBanknote[1] = getNumOfBill50();
        numOfBanknote[2] = getNumOfBill20();
    }

    public int getNumOfBill100() {
        return numOfBill100;
    }
    public int getNumOfBill50() {
        return numOfBill50;
    }
    public int getNumOfBill20() {
        return numOfBill20;
    }

    public HashMap<Integer,Integer> getHashMap() {
        return getMoney;
    }

    private void checkBill(int numOfBill) {
        if(numOfBill < 0) {
            System.out.println("BILL IS INCORRECT");
            System.exit(2);
        }
    }

    private void checkBill(int numOfBill,int putBill) {
        checkBill(numOfBill);
        if(Integer.MAX_VALUE - putBill  < numOfBill) {
            System.out.println("It's too much bills");
            System.exit(2);
        }
    }

    private void setNumOfBill100(int numOfBill100) {
        checkBill(numOfBill100);
        this.numOfBill100 = numOfBill100;
    }
    private void setNumOfBill50(int numOfBill50) {
        checkBill(numOfBill50);
        this.numOfBill50 = numOfBill50;
    }
    private void setNumOfBill20(int numOfBill20) {
        checkBill(numOfBill20);
        this.numOfBill20 = numOfBill20;
    }

    public void addBill100(int numOfBill100) {
        checkBill(numOfBill100,this.numOfBill100);
        this.numOfBill100 += numOfBill100;
        setNumOfBanknote();
    }
    public void addBill50(int numOfBill50) {
        checkBill(numOfBill50,this.numOfBill50);
        this.numOfBill50 += numOfBill50;
        setNumOfBanknote();
    }
    public void addBill20(int numOfBill20) {
        checkBill(numOfBill20,this.numOfBill20);
        this.numOfBill20 += numOfBill20;
        setNumOfBanknote();
    }

    // help method;
    private Integer[] shift(Integer[] array) {
        Integer[] newArray = new Integer[array.length-1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i+1];
        }
        return newArray;
    }

    private HashMap<Integer,Integer> withdraw(int sum,Integer[] denomination,Integer[] numOfBanknote) {
        getMoney = new HashMap<>();
        if(sum == 0) return getMoney;
        if(denomination.length == 0) {
            getMoney.put(-1,-1);
            return getMoney;
        }
        int banknote = sum / denomination[0];
        for(int i = Math.min(numOfBanknote[0],banknote); i >= 0;i--) {
            getMoney = withdraw(sum - i*denomination[0],shift(denomination),shift(numOfBanknote));
            if((!getMoney.containsKey(-1))) {
                getMoney.put(denomination[0],i);
                return getMoney;
            }
        }
        return getMoney;
    }

    public boolean isWithdraw(int sumOfUser) {
        getMoney = withdraw(sumOfUser,denomination,numOfBanknote);
        if(getMoney.containsKey(-1) || getMoney.isEmpty()) return false;
        for (int i = 0; i < denomination.length;i++) {
            if(getMoney.get(denomination[i]) == null) {
                getMoney.put(denomination[i],0);
            } else {
                numOfBanknote[i] -= getMoney.get(denomination[i]);
            }
        }
        setNumOfBill100(numOfBanknote[0]);
        setNumOfBill50(numOfBanknote[1]);
        setNumOfBill20(numOfBanknote[2]);

        /*
           for (Integer i: numOfBanknote) {
            System.out.println(i);
            }
           */

        return true;
    }
}