public class TypeConversion {

    public static void main(String[] args) {

        // Primitive Casting
        char char1 = 8253;
        short man = '‽';
        byte woman = (byte) '‽';

        System.out.println(char1);
        System.out.println(man);
        System.out.println(woman);
        System.out.println("=========================================================");


        // Object Casting
        Float floatation = 35.04f;
        Number n = floatation;
//        Double dublin = (Double) n; // This throws exception because the object is not Double
        Float floating = (Float) n;

        System.out.println(n);
        System.out.println(floating);


    }



}
