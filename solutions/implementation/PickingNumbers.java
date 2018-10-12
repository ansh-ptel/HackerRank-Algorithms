package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            List<Integer> bigList = new ArrayList<>();
            List<Integer> smallList = new ArrayList<>();
            bigList.add(a[i]);
            smallList.add(a[i]);
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }
                if (Math.abs(a[i] - a[j]) <= 1) {
                    if (a[i] < a[j]) {
                        bigList.add(a[j]);
                    } else if (a[i] > a[j]) {
                        smallList.add(a[j]);
                    } else {
                        bigList.add(a[j]);
                        smallList.add(a[j]);
                    }
                }
            }
            int localMax = bigList.size() > smallList.size() ? bigList.size() : smallList.size();
            if (localMax > max) {
                max = localMax;
            }
        }
        System.out.println(max);
    }
}
