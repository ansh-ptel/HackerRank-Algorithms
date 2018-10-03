import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long high, low, sum;
        
        arr[0] = high = low = sum = in.nextLong();
        for(int i=1; i < 5; i++){
            arr[i] = in.nextLong();
            if (arr[i] > high) high = arr[i];
            if (arr[i] < low) low = arr[i];
            sum += arr[i];
        }
        sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];

        System.out.println((sum - high) + " " + (sum - low) + " " + sum);
    }
}
