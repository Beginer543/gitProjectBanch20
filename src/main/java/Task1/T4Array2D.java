package Task1;

public class T4Array2D {
    public static void main(String[] args) {
        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of even and odd numbers for that array.

        int[][] num={
                {1,1,1,1,1,1},
                {2,2,2,2,2,2},
                {3,3,3,3,3,3}   //2D array
        };
int evenSum=0;
int oddSum=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    evenSum += num[i][j];
                } else {
                    oddSum += num[i][j];
                }
            }
        }
        System.out.println("Sum of the even numbers:"+evenSum);
        System.out.println("Sum the odd numbers:"+oddSum);
    }
}
