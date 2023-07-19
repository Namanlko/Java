// Exercise 1.1 Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100).

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks :)");
        float a = sc.nextFloat();
        System.out.println("Enter Second Subject Marks :)");
        float b = sc.nextFloat();
        System.out.println("Enter Third Subject Marks :)");
        float c = sc.nextFloat();
        System.out.println("Enter Fourth Subject Marks :)");
        float d = sc.nextFloat();
        System.out.println("Enter Fifth Subject Marks :)");
        float e = sc.nextFloat();
        float total = (a+b+c+d+e);
        float percent = total/5.0f;
        System.out.println("Marks in Percentage is "+percent);        
        sc.close();
    }    
}
