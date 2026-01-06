package array;

import java.util.HashMap;

public class longest_subarray_equal_number_0_and_1 {
    public static void main(String[] args) {

        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int n = arr.length;

        int ans = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // important

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0)
                sum += -1;
            else
                sum += 1;

            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);  // store first occurrence only
            }
        }

        System.out.println(ans);
    }
}
