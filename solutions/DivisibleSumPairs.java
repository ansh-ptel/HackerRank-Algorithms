import java.util.Scanner;

/**
 * Solves "Divisible Sum Pairs" problem from Hackerrank.
 * See https://www.hackerrank.com/challenges/divisible-sum-pairs/problem.
 *
 * @author Timur Tibeyev
 */
public class DivisibleSumPairs {

    /**
     * Returns the number of (i,j) pairs where i < j and a[i] + a[j] is evenly divisible by k.
     *
     * @param n the length of the array.
     * @param k the integer to divide the pair sum by.
     * @param ar an array of integers.
     *
     * @return number of pairs
     */
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

    /**
     * Main method.
     *
     * @param args commandline arguments.
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();
        int ar[] = new int [n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        System.out.println(divisibleSumPairs(n, k, ar));

        in.close();
    }
}
