package math;

import java.math.BigInteger;

public class Number {

    int number = 2;

    public BigInteger getFactorial() {

        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= number; i++) {

            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial;
    }

}