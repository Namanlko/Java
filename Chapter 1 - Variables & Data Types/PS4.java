// Question 4. Write a java program to convert Kilometers to Miles.

import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Kilometers :)");
        float km = sc.nextFloat();
        float miles = km/1.6f;
        System.out.println("Distance in Miles is "+miles);
        sc.close();
    }
}
