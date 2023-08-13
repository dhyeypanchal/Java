import java.math.BigInteger;

public class addStrings {
    public static String multiply(String num1, String num2){
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.multiply(b);
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(multiply(num1, num2));
    }
}
