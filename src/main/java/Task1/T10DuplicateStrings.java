package Task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T10DuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};

        // Print duplicate elements
        printDuplicates(arr);
    }

    public static void printDuplicates(String[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        // Map to store the count of each string
        Map<String, Integer> countMap = new HashMap<>();

        // Fill the map with counts
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Set to track duplicates
        Set<String> duplicates = new HashSet<>();

        // Find duplicates
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        // Print duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
}
