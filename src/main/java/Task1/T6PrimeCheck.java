package Task1;

import java.util.Scanner;

public class T6PrimeCheck {
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

