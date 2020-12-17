import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("====================== Enums =======================");
        // Did you know that an enum can be created within another class as you can see from the PrimaryColour enum
        System.out.println(PrimaryColour.YELLOW);
        System.out.println(PrimaryColour.BLUE.name());
        System.out.println(PrimaryColour.Red.name());
        System.out.println(PrimaryColour.BLUE.ordinal());
        System.out.println(PrimaryColour.Red.ordinal());

        System.out.println(Arrays.toString(PrimaryColour.values()));
        for(PrimaryColour c: PrimaryColour.values()){
            System.out.println(c.name() + " --> " + c.ordinal());
        }

        System.out.println("----------------------- Comparing enums ----------------------");
        System.out.println(PrimaryColour.Red == PrimaryColour.YELLOW);
        System.out.println(PrimaryColour.BLUE == PrimaryColour.BLUE);

        System.out.println("------------------ Enums with constructors --------------------");
        // An enum cannot have a public constructor; however, private constructors are acceptable
        // You can check out the Coin enum and see its private constructor
        System.out.println(Coin.PENNY);
        boolean theTruth = Coin.PENNY.isCopperColoured();
        System.out.println(theTruth);
        System.out.println(Arrays.toString(Coin.values()));
        Set enumSet = EnumSet.allOf(PrimaryColour.class);
        System.out.println(enumSet);
        EnumSet enumRange = EnumSet.range(PrimaryColour.BLUE, PrimaryColour.YELLOW);
        System.out.println(enumRange);
        EnumSet enumComplement = EnumSet.complementOf(enumRange);
        System.out.println(enumComplement);

    }


    private enum PrimaryColour{
        Red, BLUE, YELLOW, orange, green, papaya
    }
}
