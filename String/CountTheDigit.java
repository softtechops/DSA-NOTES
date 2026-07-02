import java.util.Scanner;

public class CountTheDigit {
    public static void main(String[] args) {
        

        // Count the Digit

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = Integer.toString(n);

        System.out.println(s.length());
    }
}
