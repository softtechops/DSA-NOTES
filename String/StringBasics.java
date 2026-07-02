
import java.util.Scanner;
public class StringBasics {
    
    public static void main(String[] args) {
        
        // Basics of String

        // String is basically an array of character 
        String s = "Hey What's up!";
        System.out.println(s);

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // Take input even after the space and store it
        System.out.println(str);

        String st = sc.next();  // Take input before space and won't store after space
        System.out.println(st);

        // To access a single element from the string
        System.out.println(s.charAt(0));
    }
}
