public class NthFibonacciSeries {
    public static void main(String[] args) {
        
        // Fibonacci problem
        int n = 8;
        int ans = fibo(n);
        System.out.println(ans);
        System.out.println(fibo(n));

    }

    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
