// java_practice_1.java
import java.util.*;

public class java_practice_1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        int x;
        System.out.println( "Enter string: ");
        s = in.nextLine();
        System.out.println( "Enter integer: ");
        x = in.nextInt();
        x = 2 * x;
        System.out.println("String is: " + s);
        System.out.println("Twice integer is: " + x);
    }
 }