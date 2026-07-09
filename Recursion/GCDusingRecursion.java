public class GCDusingRecursion {
    public static void main(String[] args) {
        
        // GCD Using Recursion
        //
        // GCD me hum highest common factor nikalete hai dono element ka 
        // for eg. 26 and 40
        // sabse pehle 26 ko divide karenge 40 se uska jo reaminder aayega usko fir vapas a se divide karenge
        // 40/26 -> divisor 1 and remainder 14 
        // then 26/14 -> divisor 1 -> remainder 10
        // 14/10 -> divisor 1 and remaider 4
        // 10/4 -> divisor 2 remainder 2
        /// 4/2 -> divisor 2 remainder 0
        int ans = gcd(26, 40);
        System.out.println(ans);

    }

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a, a);
    }
}
