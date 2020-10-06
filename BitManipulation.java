import java.util.BitSet;
import java.util.stream.IntStream;

public class BitManipulation {
    private static final long FIRST_BIT = 1L << 0;
    private static final long SECOND_BIT = 1L << 1;
    private static final long THIRD_BIT = 1L << 2;
    private static final long FOURTH_BIT = 1L << 3;
    private static final long FIFTH_BIT = 1L << 4;
    private static final long BIT_55 = 1L << 54;
    public static void main(String[] args) {
        System.out.println("Bit Manipulation");
            checkBitMask(FIRST_BIT | THIRD_BIT | FIFTH_BIT | BIT_55);

            // BitSet class
        System.out.println("------------ BitSet class -------------");
        final BitSet bitSet = new BitSet(8);
        System.out.println(bitSet);
        bitSet.set(3);
        System.out.println(bitSet);
        bitSet.set(2, 5);
        System.out.println(bitSet);
        IntStream.range(0, 8).filter(i -> i % 2 == 0).forEach(i -> bitSet.set(i));
        System.out.println(bitSet);
        IntStream.range(13, 30).filter(i -> i % 3 == 0).forEach(bitSet::set);
        System.out.println(bitSet);
        bitSet.set(20, false);
        System.out.println(bitSet);
        System.out.println(bitSet.get(32));
        System.out.println(bitSet.get(25));

        BitSet bitSet1 = new BitSet();
        bitSet1.set(7);
        bitSet1.set(15);
        bitSet1.set(9);
        System.out.println(bitSet1);
//        bitSet1.or(bitSet);
        bitSet1.and(bitSet);
        System.out.println(bitSet1);

        // Checking if a number is a power of 2
        System.out.println("-------------------- Checking if a number is a power of 2 ---------------------");
        System.out.println(isPowerOfTwo(55));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(8192));

        // Right Shift and Left Shift
        System.out.println("------------- Right Shift and Left Shift ----------------");
        int ant = 4; //100 in binary
        System.out.println(ant);
        int and = ant << 1; // shifts left and becomes 1000 in binary i.e. 8 in decimal
        System.out.println(and);
        int anger = ant >> 1; // 100 shifts right and becomes 10 in binary i.e. 2 in decimal
        System.out.println(anger);
        int annoyed = ant >>> 1; // unsigned right shift ... still remains 10 in binary i.e. 2 in decimal
        System.out.println(annoyed);
        int bar = -4; // 11111111111111111111111111111100 in binary
        System.out.println(bar);
        int bad = bar << 1; // 111111111111111111111111111111000 in binary
        System.out.println(bad);
        int bag = bar >> 1; // 1111111111111111111111111111110
        System.out.println(bag);
        int bat = bar >>> 1; // 111111111111111111111111111110
        System.out.println(bat);

        // Expressing the power of 2
        System.out.println("---------- Expressing the power of 2 ---------------");
        // Using the bitshift operation
        int twoExp5 = 1 << 5;
        System.out.println(twoExp5);
        int twoExp4 = 1 << 4;
        System.out.println(twoExp4);
        System.out.println(pow2(6));

        // Using hexadecimal
        int oldTwoExp4 = 0x10;
        System.out.println(oldTwoExp4);



    }

    private static void checkBitMask(long bitmask) {
        System.out.println("FIRST_BIT: " + ((bitmask & FIRST_BIT) != 0));
        System.out.println("SECOND_BIT: " + ((bitmask & SECOND_BIT) != 0));
        System.out.println("THIRD_BIT: " + ((bitmask & THIRD_BIT) != 0));
        System.out.println("FOURTH_BIT: " + ((bitmask & FOURTH_BIT) != 0));
        System.out.println("FIFTH_BIT: " + ((bitmask & FIFTH_BIT) != 0));
        System.out.println("BIT_55: " + ((bitmask & BIT_55) != 0));
    }

    private static boolean isPowerOfTwo(int x){
        return (x != 0) && ((x & (x - 1)) == 0);
    }

    private static int pow2(int exp){
        return 1 << exp;
    }


}
