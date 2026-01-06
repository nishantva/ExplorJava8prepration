package array;

import java.util.HashMap;

public class SubarraywithZerosum {

    public static void main(String[] args) {

        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        // Important initialization
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                count += map.get(sum);   // add frequency
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        System.out.println(count);
    }
}
