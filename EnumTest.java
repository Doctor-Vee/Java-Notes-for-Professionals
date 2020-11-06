import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("====================== Enums =======================");
        // Did you know that an enum can be created within another class as you can see from the PrimaryColour enum
        System.out.println(PrimaryColour.YELLOW);
        System.out.println(PrimaryColour.BLUE.name());
        System.out.println(PrimaryColour.RED.name());
        System.out.println(PrimaryColour.BLUE.ordinal());
        System.out.println(PrimaryColour.RED.ordinal());

        System.out.println(Arrays.toString(PrimaryColour.values()));
        for(PrimaryColour c: PrimaryColour.values()){
            System.out.println(c.name() + " --> " + c.ordinal());
        }

        System.out.println(PrimaryColour.RED == PrimaryColour.YELLOW);
        System.out.println(PrimaryColour.BLUE == PrimaryColour.BLUE);

    }


    private enum PrimaryColour{
        RED, BLUE, YELLOW
    }
}
