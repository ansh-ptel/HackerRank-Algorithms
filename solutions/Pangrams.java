import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
            int[] Lettercount = new int[26];
            String str = sc.nextLine();
            String lstr = str.toLowerCase();
            for(char ch:lstr.toCharArray())
            {
                if(ch != ' ')
                {
                    Lettercount[ch-'a']++;
                    
                }
            }
            int count = 0;
            for(int j =0;j<26;j++)
            {
                if(Lettercount[j] >0)
                {
                    count++;
                }
            }
            if(count == 26)
            {
                System.out.print("pangram");
            }
            else
            {
                System.out.print("not pangram");
            } 
    }
}