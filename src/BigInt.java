import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n1 = new BigInteger(in.next());
        BigInteger n2 = new BigInteger(in.next());

        BigInteger plus,mul;
        plus = n1.add(n2);
        mul = n1.multiply(n2);
        System.out.println(plus);
        System.out.println(mul);
    }
}
