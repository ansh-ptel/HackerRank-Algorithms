import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 0;
        float pos = 0;
        float neg = 0;
        float zero = 0;
        
        for (int i=0; i < n; i++) {
           val = scan.nextInt();
            
           if (val < 0) {neg++;}
           else if (val > 0) {pos++;}
                else {zero++;}
        }
        System.out.println(pos / n);
        System.out.println(neg / n); 
        System.out.println(zero / n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
