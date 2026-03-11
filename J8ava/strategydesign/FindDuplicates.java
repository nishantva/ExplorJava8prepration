import java.util.*;
import java.util.stream.*;

public class FindDuplicates {
    public static void main(String[] args) {

        // Create a list with duplicate values
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);

        // Set to track elements we have already seen
        Set<Integer> seen = new HashSet<>();

        // Stream the list to find duplicates
        Set<Integer> duplicates = list.stream()

                // If add() returns false, element already exists → duplicate
                .filter(n -> !seen.add(n))

                // Collect duplicates into a Set (unique duplicates)
                .collect(Collectors.toSet());

        // Print duplicates
        System.out.println(duplicates);
    }
}
