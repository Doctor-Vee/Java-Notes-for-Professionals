import assistance_classes.Employee;
import assistance_classes.Person;

import java.math.BigDecimal;

public class Operators {
    public static void main(String[] args) {
        System.out.println("===================== Operators =====================");
        System.out.println("--------------- Increment/Decrement Operators --------------");

        int a = 13;
        int b = 13;
        int c = 13;
        int d = 13;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--c);
        System.out.println(c);
        System.out.println(d--);
        System.out.println(d);

        int word = 0b00101010;
        int mask = 0b00000011;
        int lowbits = word & mask;
        System.out.println(Integer.toBinaryString(lowbits));

        System.out.println("--------------------- Remainder Operator ----------------------");
        System.out.println(55%32);
        System.out.println(34.422%23.32);
        System.out.println(5.50%2.75);
        System.out.println(6.0 % 3.0);
        System.out.println(6%3);

        System.out.println("-------------------------- INF and NaN --------------------------");
//        System.out.println(3/0); // throws exception for integers but doesn't for floats
        System.out.println(3.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(3/(-3.0/0.0));

        System.out.println("---------------------- Instance Operator ------------------------");
        String man = "Hello men";
        System.out.println(man instanceof String);
        Employee ajasco = new Employee( 32, "Ajasco");
        System.out.println(ajasco instanceof Employee);
        System.out.println(ajasco instanceof Person);

        System.out.println("------------------ The Assignment Operators ------------------");
        int x = 25;
        int y = 5;
        int z = 10;
        x += y + z;
        System.out.println(x);
        double j = 34.4;
        double k = 23.3;
        System.out.println(j %= k);
        System.out.println(j);
        System.out.println("------");
        System.out.println(5<<2);
        System.out.println(5<<1);
        System.out.println(5>>2);
        System.out.println(y);
        y <<= 2;
        System.out.println(y);
        System.out.println("------");
        System.out.println(z);
        z >>= 1;
        System.out.println(z);
        System.out.println("------");
        System.out.println(5|3); // 101 | 011 = 111 = 7
        System.out.println(5&3); // 101 & 011 = 001 = 1
        z |= 3;
        System.out.println(z);
        System.out.println("----- The conditional-and and conditional-or operators -----");
        System.out.println("--------- Using && as a guard in an expression");
        System.out.println(isZero(1));
//        System.out.println(isZero(null)); // throws null pointer exception
        System.out.println(isZero2(0));
        System.out.println(isZero2(null)); // doesn't throw null pointer exception because it does a null check first
    }

    public static boolean isZero(Integer number){
        return number == 0;
    }
    public static boolean isZero2(Integer number){
        return number != null && number == 0;
    }
}
