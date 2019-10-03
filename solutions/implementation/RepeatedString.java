package implementation;

import java.util.Scanner;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long a = 0;
        long count = n / s.length();
        long mod = n % s.length();

        char[] arr = s.toCharArray();
        for (char c: arr){
            if(c == 'a') {
                a++;
            }
        }
        a *= count;
        if (mod != 0) {
            for (int i = 0; i < mod; i++) {
                if(arr[i] == 'a') {
                    a++;
                }
            }
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
