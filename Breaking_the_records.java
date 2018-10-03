import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

 class Solution {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] s) {
  
    int highest, lowest;
    highest = lowest = s[0];
    
    int[] result = new int[2];
    
    for (int s_i = 1; s_i < s.length; s_i++)
    {
        if (s[s_i] > highest)
        {
            highest = s[s_i];
            ++result[0];
        }
        else if (s[s_i] < lowest)
        {
            lowest = s[s_i];
            ++result[1];
        }
    }
    
    return result;
}


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
