import java.util.Scanner;

public class DecreasingIncreasingOrder {
    public static void main(String[] args) {
        
        // Decreasing - Increasing Order
        // for eg n =5
        // Output -> 5 4 3 2 1 1 2 3 4 5 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1){
            System.out.print(n+" ");
         }
    }
}
