package org.example.Project1;

public class E8 {
    public static void main(String[] args) {
        int[] num = {12, 7, 45, -3, 22, 18, 6};  // Example array with different numbers

        // Initialize the largest and smallest values with the first element of the array
        int largest = num[0];
        int smallest = num[0];

        // Iterate through the array to find the maximum and minimum values
        for (int n : num) {
            if (n > largest) {
                largest = n;  // Update largest if current number is greater
            }
            if (n < smallest) {
                smallest = n;  // Update smallest if current number is less
            }
        }

        // Print the results
        System.out.println("Maximum number: " + largest);
        System.out.println("Minimum number: " + smallest);
    }
}
