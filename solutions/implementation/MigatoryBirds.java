package implementation;

import java.util.HashMap;
import java.util.Scanner;

public class MigatoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(ar[i])) {
                map.replace(ar[i], map.get(ar[i]) + 1);
            } else {
                map.put(ar[i], 1);
            }
        }
        for(int val : map.values()) {
            if (val > max) max = val;
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == max) return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
