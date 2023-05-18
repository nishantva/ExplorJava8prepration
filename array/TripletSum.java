import java.util.HashSet;

public class TripletSum {

    public static int[] findTriplet(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currentSum = target - arr[i];

            for (int j = i + 1; j < n; j++) {
                int complement = currentSum - arr[j];

                if (set.contains(complement)) {
                    return new int[]{arr[i], complement, arr[j]};
                }

                set.add(arr[j]);
            }
        }

        return new int[]{-1, -1, -1}; // Triplet not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 5, 3};
        int target = 15;

        int[] triplet = findTriplet(arr, target);
        if (triplet[0] == -1) {
            System.out.println("Triplet not found");
        } else {
            System.out.println("Triplet found: " + triplet[0] + ", " + triplet[1] + ", " + triplet[2]);
        }
    }
}





