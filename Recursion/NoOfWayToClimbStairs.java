public class NoOfWayToClimbStairs {
    public static void main(String[] args) {
        
        // No of way to climb stairs 
        // Suppose n = 5;
        // At one time it can move either 1 or 2 stairs at maximum
        // at start it can move 1 and 2 of set
        // then from 1 set -> move one or 2
        // At 2nd set -> move 1 or 2
        // and goes one

        int n =5;
        int ans = stairs(n);
        System.out.println(ans);
    }

    public static int stairs(int n){
        if(n<=2) return n;
        return stairs(n-1) + stairs(n-2);
    }
}
