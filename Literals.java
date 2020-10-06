public class Literals {
    public static void main(String[] args) {
//        int num = 123_23_34; // use of underscores for readability
//        int a = 0B011; // binary
//        int b = 00000010001; // octal ... the leading zero declares it as octal ... so be careful as to not mistake 011 for 11 in decimal representation
//        int c = 0Xa011; // hexadecimal
//        System.out.println(num);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        // STRING LITERALS
//        String man = "Welcome to the men's fellowship \nWe are glad to have you here";
//        String woman = "We need more women in tech who can take the bull by the horn and say \"I can\"";
//        String allAlphabets = "The quick brown fox " +
//                "jumped over " +
//                "the lazy dogs";
//        System.out.println(man);
//        System.out.println(woman);
//        System.out.println(allAlphabets);

        // LONG INTEGER LITERALS
        int big = 2147483647;
        long bigger = 21474836474534L;
        System.out.println(bigger);
        long intbig = big + 3; // produces a negative value because the operation is performed using 32 bit arithmetic, and addition overflows
        long longbig = big + 3L;
        System.out.println(intbig);
        System.out.println(longbig);
    }
}
