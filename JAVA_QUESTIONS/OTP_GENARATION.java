import java.util.*;

public class OTP_GENARATION {
    public static void main(String[] args) {
        Random s1 = new Random();
        int num = 10000 + s1.nextInt(99999);
        System.out.println(num);
    }
}
