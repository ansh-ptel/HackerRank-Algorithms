package implementation;

import java.util.Scanner;

public class SherlockAndSquares {
    static int squares(int a, int b) {
        int x = (int) Math.floor(Math.sqrt(a));
        int y = (int) Math.sqrt(b);
        int count = y - x;
        if (count >= 0) {
            if (Math.sqrt(a) % 1 == 0) {
                count++;
            }
            return count;
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int result = squares(a, b);
            System.out.println(result);
        }
        scanner.close();
    }
}
