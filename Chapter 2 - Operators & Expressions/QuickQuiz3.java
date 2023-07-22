// Quick Quiz 3. What will be the value of the following expression in Java.

/*

1) 

int y=7;
int x = ++y * 8; 

What will be the value of x?

2) 

char a = 'B';
a++;

What will be the value of a?

*/

public class QuickQuiz3 {
    public static void main(String[] args) {
        int y=7;
        int x = ++y * 8;
        System.out.println("Value of x is "+x);
        char a = 'B';
        a++;
        System.out.println("Value of a is "+a);
    }
}
