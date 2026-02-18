package array;

import java.util.HashMap;

public class LongestSubarrayWithZeroSum {

    public static void main(String[] args) {

        // Input array
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;

        // HashMap to store cumulative sum and its first occurrence index
        // Key   -> cumulative sum
        // Value -> index where this sum first appeared
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Important:
        // If cumulative sum becomes 0 at index i,
        // then subarray from 0 to i has sum 0.
        // So we initialize 0 with index -1.
        hm.put(0, -1);

        int length = 0;   // Stores maximum length found
        int cumSum = 0;   // Running cumulative sum

        // Traverse array
        for (int i = 0; i < n; i++) {

            // Add current element to cumulative sum
            cumSum += arr[i];

            // If this cumulative sum was seen before,
            // then elements between previous index+1 and current index sum to 0
            if (hm.containsKey(cumSum)) {

                // Calculate subarray length
                int subArrayLength = i - hm.get(cumSum);

                // Update maximum length
                length = Math.max(length, subArrayLength);

            } else {
                // Store first occurrence of this cumulative sum
                hm.put(cumSum, i);
            }
        }

        // Print result
        System.out.println("Longest Subarray Length: " + length);
    }
}
