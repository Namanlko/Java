// Question 3. Use comparison operators to find out whether a given number is greater than user entered number or not.

import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {
        
        // Let given number be 10.
        
        int x = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :)");
        int n = sc.nextInt();
        System.out.println(n>x);
        sc.close();
    }
}
