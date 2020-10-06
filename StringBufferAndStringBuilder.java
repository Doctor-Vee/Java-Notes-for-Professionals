public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        System.out.println("String builder and buffer");

        //Unlike String, StringBuffer and StringBuilder are mutable i.e. their values can change

        String str = "study ";
        str.concat("tonight");
        System.out.println(str);

        StringBuffer strB = new StringBuffer("study ");
        strB.append("tonight");
        System.out.println(strB);
        strB.replace(8, 15, " show yourself approved");
        System.out.println(strB);

        int one = 1;
        String color = "red";
        StringBuilder sb = new StringBuilder();
        sb.append("One=").append(one).append(", Color=").append(color).append('\n');
        System.out.print(sb);

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2);
        sb2.append("Manicure is for ").append(color).append(" men");
        System.out.println(sb2);



    }
}
