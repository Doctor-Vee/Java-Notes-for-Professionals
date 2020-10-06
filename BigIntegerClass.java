import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger biggest = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(biggest);

        String binaryString = "100";
        int binaryRadix = 2;
        BigInteger valueFromBinaryString = new BigInteger(binaryString, binaryRadix);
        System.out.println(valueFromBinaryString);

        BigInteger attic = BigInteger.TWO;
        System.out.println(attic);

        // Just like BigDecimal, BigInteger has the following methods: add, subtract, multiply, divide, pow, remainder

        // In addition it has these methods
        //GCD, max, min
        System.out.println("---------------- GCD, max, min -----------------");
        BigInteger ban = new BigInteger("14");
        BigInteger bar = new BigInteger("21");
        BigInteger bask = new BigInteger("42");
        System.out.println(ban.gcd(bar));
        System.out.println(ban.gcd(bask));
        System.out.println("Max = " + bar.max(bask));
        System.out.println("Min = " + bar.min(ban));

        // Comparing BigIntegers
        System.out.println("------------ Comparing BigIntegers --------------");
        // Do not use "==" because it compares references
        // Use equals which returns either true or false
        // or compareTo which returns -1, 0 or 1
        BigInteger car = BigInteger.valueOf(3);
        BigInteger cat = BigInteger.valueOf(5);
        BigInteger cap = new BigInteger("3");
        System.out.println(car.equals(cat));
        System.out.println(car.equals(cap));
        System.out.println(car.compareTo(cap));

        if(car.compareTo(cat) == -1){
            System.out.println("car is smaller than cat");
        } else if (car.compareTo(cat) == 0){
            System.out.println("car and cat are equal");
        } else if (car.compareTo(cat) == 1){
            System.out.println("car is bigger than cat");
        }

        // Binary Logic Operations
        System.out.println("---------------------- Binary Logic Operations ------------------------");
        BigInteger drink = new BigInteger("10"); // 1010 in binary
        BigInteger drive = new BigInteger("9"); // 1001 in binary
        System.out.println(drink.or(drive)); // gives 1011 in binary which is equivalent to 11
        System.out.println(drink.and(drive)); // gives 1000 in binary which is equivalent to 8
//        System.out.println(drink.not());

        // Binary logic operations that can be carried out are xor, shifRight, shiftLeft, not, andNot

        // Generating Random BigIntegers
        System.out.println("------------------ Generating Random BigIntegers using Random -------------------");
        BigInteger randomBigInt;
        for(int i = 0; i < 100; i++){
        randomBigInt = new BigInteger(11, new Random());
        // the first parameter(numBits) from the above represents the number of binary bits
            // i.e. 2 bits means you'll have random numbers from 0 to 3
            // 5 bits means you'll go from 0 to 31
             System.out.print(randomBigInt + " - ");
        if((i+1) % 10 == 0){
            System.out.println();
        }
        }

        System.out.println();
        //If you're willing to give up speed for higher-quality random numbers, you can use a new SecureRandom() instead.
        System.out.println("--------------- Generating Random BigIntegers using SecureRandom -----------------");
        BigInteger randomBigInt2;
        for(int i = 0; i < 50; i++){
            randomBigInt2 = new BigInteger(11, new SecureRandom());
            System.out.print(randomBigInt2 + " - ");
            if((i+1) % 10 == 0){
                System.out.println();
            }
        }


    }
}
