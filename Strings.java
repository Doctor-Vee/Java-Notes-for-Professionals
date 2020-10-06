import assistance_classes.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {

        // Strings are immutable
        String str = "study";
        str.concat("tonight");
        String miracle = str.concat(" The Bible");
        System.out.println(str);
        System.out.println(miracle);

        // equals and equalsIgnoreCase
        System.out.println("----------- equals and equalsIgnoreCase -----------");
        String firstString = "Test123";
        String secondString = "TEST123";

        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("They're not exactly equal Oga");
        }

        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("The strings are technically the same");
        }

        // When comparing a String to a constant value, you can put the constant value on the left side of equals to ensure that you won't get a NullPointerException if the other String is null.
        String foo = null;
        System.out.println("baz".equals(foo));
//        System.out.println(foo.equals("baz")); // Null pointer
        // Alternatively, you can use this
        System.out.println(Objects.equals(foo, "baz"));

// Switch Statement
        System.out.println("--------------- Switch statement ---------------");
        String stringToSwitch = "b"; // it throws NullPointerException if this value is null
        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A"); //the text goes here
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("Na wa for you o");
                break;
        }

// Splitting strings
        System.out.println("----------- Splitting strings ---------------");

        String manifesto = "   What do you      guys    want   from me as your ULES    Presido    ";
        String[] words = manifesto.split("\\s+");
        System.out.println(Arrays.toString(words));

        String manifested = "aaa.bbb";
//        String [] emptyWords = manifested.split("."); //. is treated as the regular expression wildcard that matches any character, and since every character is a delimiter, the result is an empty array.
        String[] emptyWords = manifested.split("\\."); //this is the proper thing to do if you want to use split by the "."
        System.out.println(Arrays.toString(emptyWords));

        String[] words2 = manifesto.split("\\s+", 9);
        System.out.println(Arrays.toString(words2));


        // Splitting a string into fixed length parts
        String seriousMatter = "This is a serious issue right now and you're laughing about it shey?";
        String [] parts = seriousMatter.split("(?<=\\G.{7})");
        System.out.println(Arrays.toString(parts));

        // String Tokenizer
        System.out.println("---------------------- String Tokenizer ---------------------");
        StringTokenizer tokenizer = new StringTokenizer(manifesto);
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken());
            System.out.print("-");
        }

        System.out.println();
        System.out.println("----------- tokenizer with different character sets for separation --------");

        StringTokenizer tokenizer2 = new StringTokenizer(manifesto, "ow");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }

        // Joining strings with a delimiter
        System.out.println("------------------ Joining strings with a delimiter -----------------");
        String colours[] = {"blue", "red", "yellow", "white", "green", "purple"};
        String colourGroup = String.join(" - \u2764 - ", colours);
        System.out.println(colourGroup);

        // StringJoiner
        System.out.println("------------------------ StringJoiner ------------------------- ");
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");// The last two arguments are optional, they define prefix and suffix for the result string
        stringJoiner.add("Lagos");
        stringJoiner.add("Calabar");
        stringJoiner.add("Ogun");
        stringJoiner.add("Abuja");
        System.out.println(stringJoiner);

        Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
        String joined = stringStream.collect(Collectors.joining(" -- "));
        System.out.println(joined);

        Stream<String> stringStream2 = Stream.of("Manicure", "Pedicure", "and so on");
        String joinedWithShapesAsSuffixAndPrefix = stringStream2.collect(Collectors.joining(", ", "\u2764", "\u2763"));
        System.out.println(joinedWithShapesAsSuffixAndPrefix);

        // StringBuilder
        System.out.println("-------------------------- StringBuilder --------------------------");
        StringBuilder buf = new StringBuilder(20);
        buf.append("Hello World!");
        buf.append(" Government na Scam as usual");
        System.out.println(buf.toString());

        // String Concatenation
        System.out.println("-------------------- String Concatenation -----------------------");
        String fruit1 = "Apple ";
        String fruit2 = "Mango ";
        String fruit3 = "Banana";
        String combination1 = fruit1 + fruit2;
        System.out.println(combination1);
        String combination2 = fruit2.concat(fruit3);
        System.out.println(combination2);
        String declaration = "My name is ".concat("Doctor Vee");
        System.out.println(declaration);

        // Substrings
        System.out.println("---------------------- Substrings --------------------");
        String s = "this is an example";
        String a = s.substring(11); // a will hold the string starting at character 11 until the end
        System.out.println(a);
        String b = s.substring(5, 10); // b will hold the string starting at character 5 and ending right before character 10
        System.out.println(b);
        String c = s.substring(5, s.length() - 3); // b will hold the string starting at character 5 ending right before b' s length is out of 3
        System.out.println(c);
        String datestring = "2015年11月17日";
        datestring = datestring.substring(0, 4) + "-" + datestring.substring(5, 7) + "-" + datestring.substring(8, 10);
        System.out.println(datestring);

        // System.format() and new line separator
        System.out.println("----------------- System.format() and new line separator ---------------");
        String lines[] = {"Hello world today", "I have come again"};
        System.out.println(String.format("line 1: %s.%nline 2: %s%n", lines[0], lines[1]));

        // Reversing Strings
        System.out.println("------------------------ Reversing Strings ---------------------");
        String text = "This is the text for reversal";
        System.out.println(text);
        System.out.println("Method 1 - StringBuilder/StringBuffer");
        StringBuilder sb = new StringBuilder(text);
        String reversed1 = sb.reverse().toString();
//        text = sb.replace(1,3, "Welcome").toString(); // this is for replacing contents of a string ... in case you need that too
        System.out.println(reversed1);
        System.out.println("Method 2 - Char Array");
        char[] textArray = text.toCharArray();
        for (int index = 0, mirroredIndex = textArray.length - 1; index < mirroredIndex; index++, mirroredIndex--) {
            char temp = textArray[index];
            textArray[index] = textArray[mirroredIndex];
            textArray[mirroredIndex] = temp;
        }
        System.out.println(new String(textArray));

        // toString
        System.out.println("---------------------------- toString ---------------------------");
        Person person = new Person(25, "John");
        System.out.println(Person.class.getName());
        System.out.println(Integer.toHexString(Person.class.hashCode()));
        System.out.println(person);//Check the Person class and see the implementation of its toString()

        // Removing whitespace
        System.out.println("--------------------- Removing whitespace ---------------------");
        String textish = "              This is   \n   very spacious    \n        ";
        System.out.println(textish);
        System.out.println(textish.trim());
        System.out.println("\tHello world    ");
        System.out.println("\tHello world    ".trim());

        // Replacing parts of a string
        System.out.println("------------- Replacing parts of a string ---------------");
        String toReplaceFrom = "This is a replaceable text";
        System.out.println(toReplaceFrom.replace("a r", "an irr"));
        System.out.println(toReplaceFrom);

        String toReplaceByRegex = "This is definitely going to change in the range sir";
        System.out.println(toReplaceByRegex.replaceFirst("(\\w*nge)", "$1 to something else")); // the regex style only works for replaceAll() and replaceFirst()

        // Other methods
        //length
        //charAt()

        System.out.println("----- Counting occurrences of substring in string using regex ----");
        String fishInfo = "One fish, two fishes, three fishes, red fish";

        // Using StringUtils
        // To use StringUtils, you'd have to import this first
        //        import org.apache.commons.lang3.StringUtils;
//        System.out.println(StringUtils.countMatches());


        // Counting occurrences of substring in string using regex
        System.out.println(countStringInString("fish", fishInfo));
        System.out.println(countStringInString("is", "This is another text"));
        System.out.println(countStringInString("t", "This is another text"));

    }

    public static int countStringInString(String search, String text) {
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(text);

        int stringOccurrences = 0;

        while (matcher.find()) {
            stringOccurrences++;
        }
        return stringOccurrences;
    }
}
