package Task1;

public class T8ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};

        // Call the method to find max and min
        int[] result = findMaxMin(arr);
        System.out.println("Maximum value: " + result[0]);  // Output: Maximum value: 9
        System.out.println("Minimum value: " + result[1]);  // Output: Minimum value: 1
    }

    public static int[] findMaxMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return new int[] { max, min };




    }
}
