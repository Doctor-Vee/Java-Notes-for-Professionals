import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {

        // BigDecimals are immutable

        // Comparing BigDecimals
        System.out.println("------------------ Comparing BigDecimals -----------------");
        BigDecimal a = new BigDecimal(5);
        BigDecimal b = new BigDecimal(6.3);
        BigDecimal c = new BigDecimal(4.9999999);
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(a));
        System.out.println(a.equals(new BigDecimal(5))); // value and scale are equal, returns true
        System.out.println(a.equals(new BigDecimal(5.00)));

        // Comparing Float and BigDecimal
        System.out.println("------------------------- Comparing float to decimal -----------------------");
        // Due to way that the float type is represented in computer memory, results of operations using this type can be inaccurate - some values are stored as approximations.
        float accountBalance = 10000.00f;
        System.out.println("Operations using float:");
        System.out.println("1000 operations for 1.99");
        for(int i = 0; i<1000; i++){
            accountBalance -= 1.99f;
        }
        System.out.println(String.format("Account balance after float operations: %f", accountBalance));
        BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
        System.out.println("Operations using BigDecimal:");
        System.out.println("1000 operations for 1.99");
        BigDecimal operation = new BigDecimal("1.99");
        for(int i = 0; i<1000; i++){
            accountBalanceTwo = accountBalanceTwo.subtract(operation);
        }
        System.out.println(String.format("Account balance after BigDecimal operations: %f", accountBalanceTwo));

        // BigDecimal.valueOf()
        System.out.println("------------------------ BigDecimal.valueOf() -----------------------");
        // This is the preferred way to convert a double (or float) into a BigDecimal
        BigDecimal at = BigDecimal.valueOf(24.343);
        BigDecimal by = new BigDecimal(24.343); // Returns inaccurate result
        BigDecimal ch = new BigDecimal("15.15"); // This is another alternative for converting floats to BigDecimal
        BigDecimal dp = new BigDecimal(String.valueOf(15.15)); // This is equivalent to the above
        System.out.println(at);
        System.out.println(by);
        System.out.println(ch);
        System.out.println(dp);
        System.out.println(at.multiply(ch));
        MathContext returnRules = new MathContext(4, RoundingMode.FLOOR);
        MathContext returnRules2 = new MathContext(7, RoundingMode.HALF_DOWN);
        System.out.println(at.multiply(ch, returnRules));
        System.out.println(at.multiply(ch, returnRules2));

        // Operations in BigDecimal
        System.out.println("--------------- Operations in BigDecimal -----------------");
        // Non terminating Division
        BigDecimal egg = new BigDecimal(5);
        BigDecimal early = new BigDecimal(7);
        BigDecimal earth = new BigDecimal(22);
        System.out.println(early.divide(egg));
        System.out.println(earth.divide(egg));
//        System.out.println(egg.divide(early)); // throws Arithmetic Exception because the decimal part doesnt terminate
        System.out.println(earth.divide(early, returnRules2)); // would have thrown an exception but doesn't because we have included the precision and rounding mode.

        // Remainder or Modulus
        System.out.println(earth.remainder(early));

        // Power
        System.out.println(egg.pow(3));

        // Min
        System.out.println(early.min(egg));
        System.out.println(early.min(early));

        // Max
        System.out.println(earth.max(early));

        // Move Point to Left
        System.out.println(at.multiply(dp).movePointLeft(2));

        //Move Point to Right
        System.out.println(at.multiply(ch).movePointRight(9));

        // Initialisation of BigDecimals with zero, one and ten
        System.out.println("-------------- Initialisation of BigDecimals with zero, one and ten ---------------");
        // It's good practice to use these instead of using the actual numbers ... this helps you avoid unnecessary instantiation
        BigDecimal bad0 = new BigDecimal(0);
        BigDecimal good0 = BigDecimal.ZERO;
        BigDecimal bad10 = new BigDecimal(10);
        BigDecimal good10 = BigDecimal.TEN;
        System.out.println(bad0);
        System.out.println(good0);
        System.out.println(bad10);
        System.out.println(good10);

        // Immutability
        System.out.println("------------------------ Immutability ----------------------------");
        BigDecimal great = new BigDecimal("23.34");
        System.out.println(great);
        great.add(new BigDecimal("32.34")); // this doesn't change the value of 'great'
        System.out.println(great);
        BigDecimal greater = great.add(new BigDecimal("32.34"));
        System.out.println(greater);
        System.out.println(great);

    }
}
