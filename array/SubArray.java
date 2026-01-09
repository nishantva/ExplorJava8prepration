package array;

import java.util.HashMap;

public class SubArraySum5 {

    public static void main(String[] args) {

        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int key = 5;

        countSubarrays(arr, key);
    }

    private static void countSubarrays(int[] arr, int key) {

        int currSum = 0;
        int count = 0;

        // prefixSum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // important base case
        map.put(0, 1);  //It handles subarrays that start from index 0.

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            // check for subarray with sum = key
            if (map.containsKey(currSum - key)) {
                count = count + map.get(currSum - key);
            }

            // NORMAL way instead of getOrDefault
            if (map.containsKey(currSum)) {
                map.put(currSum, map.get(currSum) + 1);
            } else {
                map.put(currSum, 1);
            }
        }

        System.out.println("Total subarrays with sum " + key + " = " + count);
    }
}

