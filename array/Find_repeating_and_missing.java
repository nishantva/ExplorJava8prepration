import java.util.HashMap;

public class Find_repeating_and_missing {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Find repeating
        for (int num : arr) {
            if (map.containsKey(num)) {
                System.out.println("Repeated number: " + num);
            } else {
                map.put(num, 1);
            }
        }

        // Find missing
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                System.out.println("Missing number: " + i);
            }
        }
    }
}
