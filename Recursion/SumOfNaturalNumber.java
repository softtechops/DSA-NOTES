

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        
        // Sum of Natural Numbar Using Recursion
        // int n = 8;
        // 1+2+3+5+6+7+8

        int n = 8;
        int ans = natural(n);
        System.out.println(ans);
    }

    public static int natural(int n){
        if(n==1) return n;
        return n + natural(n-1);

    }
}
