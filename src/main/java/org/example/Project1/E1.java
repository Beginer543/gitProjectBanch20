package org.example.Project1;

public class E1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loop to find the highest and lowest temperature for the week.
        int []temperatures={77,82,78,77,76,75,84};

        int highestTemp=temperatures[0];
        int lowestTemp=temperatures[0];
        for (int i=0; i<temperatures.length; i++){

            if (temperatures [i] > highestTemp){
                highestTemp=temperatures[i];
            }
            if (temperatures[i]<lowestTemp) {
                lowestTemp = temperatures[i];
            }

        }
        System.out.println("Highest temperature of the week: "+ highestTemp+ "°F");
        System.out.println("Lowest temperature of the week: "+lowestTemp+ " °F");







    }
}
