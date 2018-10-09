package implementation;

import java.util.Scanner;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int i;
        for (i = p; i > m && s >= i; i -= d) {
            count++;
            s -= i;
        }
        return count + (i - d <= m ? s / m : 0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] pdms = scanner.nextLine().split(" ");
        int p = Integer.parseInt(pdms[0]);
        int d = Integer.parseInt(pdms[1]);
        int m = Integer.parseInt(pdms[2]);
        int s = Integer.parseInt(pdms[3]);
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        scanner.close();
    }
}
