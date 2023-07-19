// Question 2. Write a program to calculate CGPA using marks of three subjects (Out of 100).

import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks :)");
        float a = sc.nextFloat();
        System.out.println("Enter Second Subject Marks :)");
        float b = sc.nextFloat();
        System.out.println("Enter Third Subject Marks :)");
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30.f;
        System.out.println("CGPA is "+cgpa);
        sc.close();
    }
}
