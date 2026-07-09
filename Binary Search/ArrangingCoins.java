public class ArrangingCoins {
    public static void main(String[] args) {
        

        // Arranging Coins Problem
        // Leetcode -> 441

        // int n = 2147483647;
        // int low = 1;
        // int hi = n;
        // int k = 0;
        // while(low<=hi){
        //     k++;
        //     hi = hi - low;
        //     low = low + 1;
        // }
        // System.out.println(k);

        int n = 4;
        int lo = 0, hi = n;
        int k = -1;
        while(lo<=hi){
            if(n==1){
                System.out.println("1");
                break;
            }
            int mid = lo + (hi - lo)/2;
            int totalSum = (mid * (mid + 1))/2;
            if(totalSum>n) hi = mid -1;
            else if(n>totalSum) lo = mid+1;
            else k = mid;
        }

        if(n==0) System.out.println("0");
        System.out.println(hi);
    }
}
