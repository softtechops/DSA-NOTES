import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        
        // Factorial of a number using recursion

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

    }

    public static int factorial(int n){
        if (n==0) return 1;
        int ans = n * factorial(n-1);
        return ans;
    }
}
