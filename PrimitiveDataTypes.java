import java.util.Objects;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        char heart = '\u2764';
        System.out.println(heart); // prints a heart shape

        // prints a to z
        for(int i = 0; i < 26; i++){
            System.out.print((char) ('a' + i));
            System.out.print(" ");
        }
        System.out.println();

        // float
        System.out.println("----------------- float -----------------");
//        float result = 37.2; //Won't work unless you add an 'f' at the end of the number
        float result = 37.2f + -2.6f;
        System.out.println(result);
        float notExactFloat = 3.14159261847f;
        System.out.println(notExactFloat); // weird value printed
        // start of section
        float f1 = 0f;
        float f2 = -0f;
        System.out.println(f1 == f2); // true
        System.out.println(1f / f1); // Infinity
        System.out.println(1f / f2); // -Infinity
        System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
        // the above section is the same case for double

        // int
        System.out.println("----------------- int -----------------");
        int demo = 2147483647; //maximum positive integer
        System.out.println(demo); //prints 2147483647
        demo = demo + 1; //leads to an integer overflow
        System.out.println(demo); // prints -2147483648
        int man = (int) 232.83;
        System.out.println(man);
        System.out.println(Integer.MAX_VALUE);

        // double
        System.out.println("----------------- double -----------------");
        double myDouble = 974.21;
        double anotherDouble = -658.7;
        double subtractedDoubles = myDouble - anotherDouble; // 1632.91
        System.out.println(subtractedDoubles);
        double scientificNotationDouble = 1.2e-3; // 0.0012
        System.out.println(scientificNotationDouble);
        double notExactDouble = 1.32 - 0.42; // result should be 0.9 but prints 0.9000000000000001
        System.out.println(notExactDouble);

        // long
        System.out.println("----------------- long -----------------");
        long high = Long.MAX_VALUE; // high == 9223372036854775807L
        System.out.println(high);
        System.out.println(342L == 342l); // however it is good practice to use capital as it is easier to distinct from digit one:
        Long val1 = 127L;
        Long val2 = 127L;
        System.out.println(val1 == val2); // true
        long valX = 128L;
        long valY = 128L;
        System.out.println(valX == valY);
        Long val3 = 128L;
        Long val4 = 128L;
        System.out.println(val3 == val4); // false
        // To properly compare 2 Object Long values, use the following code(From Java 1.7 onward):
        System.out.println(Objects.equals(val3, val4)); // true
        System.out.println(val3.equals(val4)); // also true

        // byte
        System.out.println("----------------- long -----------------");
        byte byteFigure1 = 13;
        byte byteFigure2 = 12;
        byte resultByte = (byte) (byteFigure1 + byteFigure2); // you must cast the result to byte otherwise it won't work
        System.out.println(resultByte);

        // short
        System.out.println("----------------- long -----------------");
        short shortMan = -242;
        short shortWoman = 2342;
        short shortResult = (short) (shortMan + shortWoman); // you must cast the result to short just like the case of byte
        System.out.println(shortResult);
        System.out.println(Short.MAX_VALUE);

    }
}
