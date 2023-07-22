// Question 2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade :)");
        char grade = sc.next().charAt(0);
        char newgrade = (char)(grade + 8);
        System.out.println("Encrypted Grade is "+grade);
        System.out.println("Decrypted Grade is "+newgrade);
        System.out.println("Original Grade is "+grade);

        sc.close();
    }
}
