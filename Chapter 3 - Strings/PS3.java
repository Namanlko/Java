// Question 3. Write a java program to fill in a letter template which looks like below.

/*
letter = "Dear <|name|, Thanks a lot!!>"
 */

// Replace <|name|> with a String (Some Name)

import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :)");
        String name = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a lot!!";
        System.out.println(letter.replace("<|name|>", name));
        sc.close();
    }
}
