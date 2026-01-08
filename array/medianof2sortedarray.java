class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        // Step 1: Create a new array
        int[] merged = new int[m + n];

        // Step 2: Copy nums1 elements
        int k = 0;
        for (int i = 0; i < m; i++) {
            merged[k++] = nums1[i];
        }

        // Step 3: Copy nums2 elements
        for (int i = 0; i < n; i++) {
            merged[k++] = nums2[i];
        }

        // Step 4: Sort the array
        Arrays.sort(merged);

        // Step 5: Find median
        int total = merged.length;

        if (total % 2 == 0) {
            return (merged[total / 2] + merged[total / 2 - 1]) / 2.0;
        } else {
            return merged[total / 2];
        }
    }
}
