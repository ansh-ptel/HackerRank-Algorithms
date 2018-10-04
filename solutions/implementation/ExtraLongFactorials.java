package implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger t = new BigInteger("1");
        while (n >= 1) {
            t = t.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(t);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        extraLongFactorials(n);
        scanner.close();
    }
}
