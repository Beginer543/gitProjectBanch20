package Task1;

public class T9SecondLegest {
    public static void main(String[] args) {
        int[] num = {3, 1, 4, 45, 5, 9, 2};  // Example array

        int largest = num[0];
        int secondLargest = num[0];
        for (int n : num) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }
        System.out.println(secondLargest);

    }
}