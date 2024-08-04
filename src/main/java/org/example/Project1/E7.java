package org.example.Project1;

public class E7 {
    public static void main(String[] args) {
        int n=10;// numbers  of terms to display
        int first=0, second=1;
        System.out.println("First "+n+" numbers in Fibonacci series:");
        for (int i=1; i<=n; i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
