public class KthImdexMissingPosNum {
    public static void main(String[] args) {
        

        // Kth Index Missing Positive Number

        // Approah to solve this ques/
        /*
        1. Count the missing element 
        2. check if the kth with missing element
            a. If smaller or equal -> hi = mid-1;
            b. if bigger than k -> low  */

        int[] arr = {2,3,4,7,11};
        int k =2;
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int missPos = arr[mid] - (mid+1);
            if(missPos>k) hi = mid-1;
            else if(missPos<=k) lo = mid+1;
        }

        System.out.println(lo+k);
    }
}
