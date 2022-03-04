package by.common.exercise15;

import by.exercise15.Main;

public class Primes {
    public boolean isPrime(int number) {
        boolean prime = true;
        if(number < 2) return false;
        if(number == 2) return prime;
        for(int i = 2;i <= number/2;i++) {
            if(number%i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public void findSecondPrimeFromFiftyToSeventy() {
        int count = 0;
        for (int i = 50;i < 71;i++) {
            if(isPrime(i)) {
                count++;
                if(count == 2) {
                    System.out.println(i + " - it's a second prime number between 50 and 70");
                    break;
                }
            }

        }
    }
}
