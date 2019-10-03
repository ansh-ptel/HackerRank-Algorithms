import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        
        int n = h.length;

        Stack<Integer> stack = new Stack<>();
        
        long max_area = 0;
        long area_with_top = 0;
        int top = 0;

        int i=0;
        while(i<n){
            
            if(stack.isEmpty() || h[stack.peek()] <= h[i]){
                stack.push(i++);
            }

            else{
                top = stack.peek();
                stack.pop();
                area_with_top = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                
                max_area = Math.max(max_area , area_with_top);


            }
        } 

        while(!stack.isEmpty()){
            
            top = stack.peek();
            stack.pop();
            
            area_with_top = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);

            max_area = Math.max(max_area , area_with_top);

        }

        return max_area;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
