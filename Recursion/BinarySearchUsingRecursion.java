public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        
        // Binary Search Using recursion

        int[] arr = {2,7,8,36,53,68,84,93};
        int n = arr.length-1;
        int tar = 84;
        int ans = bs(arr,tar,0,n);
        System.out.println(ans);
    }

    public static int bs(int[] arr , int tar , int lo , int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid]==tar) return mid;
        else if(arr[mid]>tar) return bs(arr, tar, lo, mid-1);
        else return bs(arr, tar, mid+1, hi);
    }
}
