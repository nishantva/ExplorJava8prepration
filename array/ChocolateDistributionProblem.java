package array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            minDiff = Math.min(minDiff, arr[i + m - 1] - arr[i]);
        }

        System.out.println(minDiff);
    }
}




