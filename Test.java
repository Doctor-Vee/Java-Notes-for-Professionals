import java.sql.Timestamp;

public class Test {
    public static void main(String[] args) {
        System.out.println("Timestamp");
        Timestamp now = new Timestamp(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(now);
    }
}
