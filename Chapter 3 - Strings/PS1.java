// Question 1. Write a java program to convert a String to Lowercase.

import java.util.Scanner;

public class PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :)");
        String str = sc.nextLine();
        System.out.println("String in Lowercase is "+str.toLowerCase());
        sc.close();
    }
}
