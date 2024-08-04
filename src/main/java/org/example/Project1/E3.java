package org.example.Project1;

public class E3 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] num={
                {12,33,78,54,10,55},
                {32,50,95,88,45,37},
                {55,22,11,14,15,17}   //2D array
        };
        System.out.println("All numbers from the array:");
        for (int i=0; i<num.length;i++){
            for (int j=0; j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();// Move the next line after each row
        }

        System.out.println("Even numbers from the array:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
        }
        System.out.println();// Move to the next line after printing even numbers
        System.out.println("Odd numbers from the array:"); // printing odd numbersfrom the array
        for (int i=0; i< num.length;i++){
            for (int j=0; j<num[i].length;j++){
                if (num[i][j]%2!=0){
                    System.out.print(num[i][j]+" ");
                }

            }

        }

    }
}
