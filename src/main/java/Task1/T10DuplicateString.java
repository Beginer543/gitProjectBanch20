package Task1;

public class T10DuplicateString {
    public static void main(String[] args) {
//10.Write a program to print out duplicate elements from an Array of Strings?

        String[] fruits={"Apple","Lemon","Chery","Pineaple", "Orange","Lemon"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i; j < fruits.length; j++) {

                if (fruits[i].equals(fruits[j]) && i != j) {
                    System.out.println(fruits[i]);
                }
            }
        }
    }
}