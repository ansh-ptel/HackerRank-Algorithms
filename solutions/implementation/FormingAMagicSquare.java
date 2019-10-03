package implementation;

import java.util.Scanner;

public class FormingAMagicSquare {
    static int formingMagicSquare(int[][] s) {
        int[][][] arr = {
                {
                        {8, 1, 6},
                        {3, 5, 7},
                        {4, 9, 2}},
                {
                        {6, 1, 8},
                        {7, 5, 3},
                        {2, 9, 4}},
                {
                        {4, 9, 2},
                        {3, 5, 7},
                        {8, 1, 6}},
                {
                        {2, 9, 4},
                        {7, 5, 3},
                        {6, 1, 8}},
                {
                        {8, 3, 4},
                        {1, 5, 9},
                        {6, 7, 2}},
                {
                        {4, 3, 8},
                        {9, 5, 1},
                        {2, 7, 6}},
                {
                        {6, 7, 2},
                        {1, 5, 9},
                        {8, 3, 4}},
                {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8}},
        };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int localMin = 0;
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if (s[j][k] != arr[i][j][k]) {
                        localMin += Math.abs(s[j][k] - arr[i][j][k]);
                    }
                }
            }
            if (min > localMin) {
                min = localMin;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
