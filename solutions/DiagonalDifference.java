import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int primDiag = 0;
        int secDiag = 0;
        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
               arr[i][j] = scan.nextInt();
               if (i==j) {primDiag = primDiag + arr[i][j];}
               if (i + j == n - 1) {secDiag = secDiag + arr[i][j];}
            }
        }
        if (primDiag - secDiag < 0) {System.out.println(0 - (primDiag - secDiag));}
        else {System.out.println(primDiag - secDiag);}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
