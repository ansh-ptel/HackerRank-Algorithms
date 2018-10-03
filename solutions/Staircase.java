import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
         
      for (int i = n; i > 0; i--) {
          for (int j = (i-1); j > 0; j--) 
              System.out.print(" ");
          for (int k = (n - (i-1)); k > 0; k--)
              System.out.print("#");
         System.out.println();
      };
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  }
}
