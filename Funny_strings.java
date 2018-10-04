import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
  
  static String funnyString(String s) {
      String r=new StringBuilder(s).reverse().toString();
      int len=s.length();
      int count=0;
      String f="Funny";
      String nf="Not Funny";
      for(int i=1;i<len;i++){
          if(Math.abs(s.charAt(i)-s.charAt(i-1))== Math.abs(r.charAt(i)-r.charAt(i-1))){
           count++;
          }
      }
       if(count == (len-1)){
         return f;
       }
    return nf;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
