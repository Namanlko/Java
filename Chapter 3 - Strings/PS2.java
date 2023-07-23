// Question 2. Write a java program to replace spaces with under scores.

import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :)");
        String str = sc.nextLine();
        String newStr = str.replace(' ','_');
        System.out.println("New String is "+newStr);
        sc.close();
    }
}
