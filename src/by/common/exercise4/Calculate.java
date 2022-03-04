package by.common.exercise4;

import java.math.BigInteger;

public class Calculate {
    public BigInteger sumAndMultiply(int a, int b) {
        Integer ia = a;
        Integer ib = b;
        BigInteger first = new BigInteger(ia.toString());
        BigInteger second = new BigInteger(ib.toString());
        BigInteger product = first.multiply(second).add(first).add(second);
        return product;
    }
}
