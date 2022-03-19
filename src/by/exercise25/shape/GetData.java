package by.exercise25.shape;

import java.util.Scanner;

public class GetData {
    private static int getSumOfUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void description() {
        System.out.println("Input sum of money which you want to withdraw!");
    }

    public static void toConsole(Atm atm) {
        if(atm.isWithdraw(getSumOfUser())) {
            System.out.println("your operation was successful");
            System.out.println(atm.getHashMap());
        }
        else System.out.println("your operation wasn't successful");
    }

    public static String defaultData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to withdraw money enter 'get' push ENTER");
        System.out.println("if you want to add money enter 'add' and push ENTER");
        return scanner.next();
    }

    public static void getMoney(String input,Atm atm) {
        Scanner scanner = new Scanner(System.in);
        if(input.equals("get")) {
            while(true) {
                System.out.println("do you want to continue?(y | n)");
                input = scanner.next();
                if(input.equals("y")) {
                    GetData.description();
                    GetData.toConsole(atm);
                }
                if(input.equals("n")) {
                    System.exit(0);
                }
            }
        }
    }

    public static void addMoney(String input,Atm atm) {
        Scanner scanner = new Scanner(System.in);
        if(input.equals("add")) {
            while (true) {
                System.out.println("do you want to continue?(y | n)");
                input = scanner.next();
                if(input.equals("y")) {
                    System.out.println("enter denomination do you want to add?");
                    int den = scanner.nextInt();
                    if(den == 100) {
                        System.out.println("enter number of 100");
                        atm.addBill100(scanner.nextInt());
                    }
                    if(den == 50) {
                        System.out.println("enter number of 50");
                        atm.addBill50(scanner.nextInt());
                    }
                    if(den == 20) {
                        System.out.println("enter number of 20");
                        atm.addBill20(scanner.nextInt());
                    }
                }
                if(input.equals("n")) {
                    System.exit(0);
                }
            }
        }
    }
}