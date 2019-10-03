package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int total = 0;
        int counter = 0;
        
        
        for(int i = 2; i <= b[b.length - 1]; i++) {
            for(int bNum : b) {
                if (bNum % i == 0) counter++;
            }
            if (counter == b.length) list.add(i);
            counter = 0;
        }

        for(int aNum : a) {
            if (aNum == 1) list.add(1);
        }
        
        for(int i = 0; i < list.size(); i++) {
            for(int aNum : a) {
                if (list.get(i) % aNum == 0) counter++;

            }
            if (counter == a.length) total++;
            counter = 0;

        }
        System.out.println(list);
        return total;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
