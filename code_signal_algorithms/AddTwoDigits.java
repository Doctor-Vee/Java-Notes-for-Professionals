package code_signal_algorithms;

/**
 * Codewriting
 *
 * 300
 *
 * You are given a two-digit integer n. Return the sum of its digits.
 *
 * Example
 *
 * For n = 29, the output should be
 * addTwoDigits(n) = 11.
 */
public class AddTwoDigits {
    public static void main(String[] args) {
        System.out.println(addTwoDigits(58));
    }


    public static int addTwoDigits(int n) {
        String nString = String.valueOf(n);
        return Integer.parseInt(nString.substring(0,1)) + Integer.parseInt(nString.substring(1));
    }
}
