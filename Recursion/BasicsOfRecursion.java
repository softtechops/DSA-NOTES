import java.util.Scanner;

public class BasicsOfRecursion {
    public static void main(String[] args) {
        
        // Basics of Recursion

        //printing from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
}
