package by.common.exercise13;

import java.math.BigInteger;

public class FactorialBigInt {
    public static BigInteger multiplyFromOneToTwentyFive() {
        Integer num = 1;
        BigInteger product = new BigInteger("1");
        do {
            BigInteger second = new BigInteger(num.toString());
            product = product.multiply(second);
            num++;
        } while(num != 26);
        return product;
    }
}
