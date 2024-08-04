package org.example.Project1;

public class E6 {
    public static void main(String[] args) {
        int number=99;
        boolean isPrime=true;

        for (int i = 2; i <number ; i++) {
            if (number%i==2){
                isPrime=false;
            }
        }
        System.out.println(isPrime);

    }
}
