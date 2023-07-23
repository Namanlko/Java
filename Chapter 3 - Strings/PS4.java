// Question 4. Write a java program to detect double and triple spaces in a String.

import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :)");
        String str = sc.nextLine();
        System.out.println("Double Space is present at index "+str.indexOf("  "));
        System.out.println("Triple Space is present at index "+str.indexOf("   "));
        sc.close();
    }
}
