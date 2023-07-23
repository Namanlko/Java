// String Methods in Java.

public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Harry";

        // 1) Length Method.
        System.out.println("Length of String is "+name.length());

        // 2) To Lower Case Method.
        System.out.println("Lower Case of String is "+name.toLowerCase());

        // 3) To Upper Case Method.
        System.out.println("Upper Case of String is "+name.toUpperCase());

        // 4) Trim Method.
        String nameTrim = "      Naman Pandey      ";
        System.out.println("Trimmed String is "+nameTrim.trim());

        // 5) Sub String Method.
        System.out.println("Sub String of String is "+name.substring(3));

        // 6) Sub String Method.
        System.out.println("Sub String of String is "+name.substring(1,3));

        // 7) Replace Method.
        System.out.println("Replace r with p in String is "+name.replace('r','p'));

        // 8) Starts With Method.
        System.out.println("Is String starts with Ha "+name.startsWith("Ha"));

        // 9) Ends With Method.
        System.out.println("Is String ends with rry "+name.endsWith("rry"));

        // 10) Char At Method.
        System.out.println("Character at index 2 is "+name.charAt(2));

        // 11) Index Of Method.
        System.out.println("Index of Character H is "+name.indexOf('H'));

        // 12) Index Of Method.
        System.out.println("Index of Character r Starting from 2 is "+name.indexOf('r',2));

        // 13) Last Index Of Method.
        System.out.println("Last Index of Character r is "+name.lastIndexOf('r'));

        // 14) Last Index Of Method.
        System.out.println("Last Index of Character r Starting from 2 is "+name.lastIndexOf('r',2));

        // 15) Equals Method.
        String str1 = "Naman Pandey";
        String str2 = "Naman Pandey";
        System.out.println("Is Both String equals "+str1.equals(str2));

        // 16) Equals Method Ignore Case.
        String str3 = "Naman Pandey";
        String str4 = "Naman pandey";
        System.out.println("Is Both String equals "+str3.equalsIgnoreCase(str4));

    }
}
