package implementation;

import java.util.Scanner;

public class TaumAndBday {
    static long taumBday(long x, long y, long bx, long wy, long z) {
        if (bx > wy && bx > z + wy) {
            bx = z + wy;
        } else if (wy > bx && wy > z + bx) {
            wy = z + bx;
        }
        return x * bx + y * wy;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");
            int b = Integer.parseInt(bw[0]);
            int w = Integer.parseInt(bw[1]);
            String[] bcWcz = scanner.nextLine().split(" ");
            int bc = Integer.parseInt(bcWcz[0]);
            int wc = Integer.parseInt(bcWcz[1]);
            int z = Integer.parseInt(bcWcz[2]);
            long result = taumBday(b, w, bc, wc, z);
            System.out.println(result);
        }
        scanner.close();
    }
}
