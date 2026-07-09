import java.util.Scanner;

public class AtoPowerB {
    public static void main(String[] args) {
        
        // A to power B a^b using recursion
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = power(a, b);
        System.out.println(ans);

    }

    public static int power(int a, int b){
        if(b==0) return 1;
        if(b%2==0) return power(a, b/2) * power(a, b/2);
        else return power(a, b/2) * power(a, b/2) * a;
    }
}
