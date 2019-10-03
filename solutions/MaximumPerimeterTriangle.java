import java.util.Arrays;

// Maximum Perimeter Triangle

public class MaximumPerimeterTriangle {
     
     /**
     *
     * @param sticks: an integer array that represents the lengths of sticks available
     * @return: an array of 3 integers that represent the side lengths of
     * the chosen triangle in non-decreasing order
     */
    static int[] maximumPerimeterTriangle(int[] sticks) {

        int n = sticks.length;
        // sort sticks first
        Arrays.sort(sticks);

        int i = n - 3;
        // search from end of sticks and check if a[x] + a[y] > a[z]
        while (i >= 0 && sticks[i] + sticks[i + 1] <= sticks[i + 2]) i--;

        // if no such selection is possible, no non-degenerate triangle exists
        if (i < 0) {
            return new int[]{-1};
        }
        return new int[]{sticks[i], sticks[i + 1], sticks[i + 2]};
    }

    public static void main(String[] args) {
        int[] res = maximumPerimeterTriangle(new int[]{1, 1, 1, 2, 3, 5}); 
        System.out.println(Arrays.toString(res));  // [1,1,1]
    }
	 
 
    

}
