// Quick Quiz 1. How will you write the following expressions in Java?

/*

1. (x-y)/2
2. (b*b - 4*a*c)/(2*a)
3. (v*v - u*u)
4. (a*b)-d

*/

public class QuickQuiz1{
    public static void main(String[] args) {
        int x=2, y=1, b=5, a=3, c=1, d=3, u=2, v=3;
        int ans1 = (x-y)/2;
        int ans2 = (b*b - 4*a*c)/(2*a);
        int ans3 = (v*v - u*u);
        int ans4 = (a*b)-d;
        System.out.println("Answer 1 is "+ans1);
        System.out.println("Answer 2 is "+ans2);
        System.out.println("Answer 3 is "+ans3);
        System.out.println("Answer 4 is "+ans4);
    }
}