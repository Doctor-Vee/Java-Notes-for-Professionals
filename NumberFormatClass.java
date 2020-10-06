import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {

        Locale locale = new Locale("en", "IN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        System.out.println(numberFormat.format(13432341.2342254));
        System.out.println(currencyFormat.format(13432341.2342254));
        System.out.println(percentageFormat.format(13432341.2342254));
        System.out.println(percentageFormat.format(0.3255));

        // Controlling the number of digits
        System.out.println("------------- Controlling the number of digits --------------");
        numberFormat.setMaximumFractionDigits(5);
        System.out.println(numberFormat.format(13432341.2342254));
        numberFormat.setMinimumIntegerDigits(9);
        System.out.println(numberFormat.format(13432341.2342254));

    }
}
