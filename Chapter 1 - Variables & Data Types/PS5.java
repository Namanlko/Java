// Question 5. Write a java program to detect whether a number enetered by the user is integer or not.

import java.util.Scanner;

public class PS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :)");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
