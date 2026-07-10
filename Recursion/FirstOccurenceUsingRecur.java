public class FirstOccurenceUsingRecur {
    public static void main(String[] args) {
        
        // First Occurence
        int[] arr = {2,3,4,7,8,9,9,9,9,12,14,18,19};
        int tar = 9;
        int n = arr.length-1;
        int ans = foccur(arr, tar, 0, n, -1);
        System.out.println(ans);

    }

    public static int foccur(int[] arr , int tar, int lo, int hi, int ans){
        if(lo>hi) return ans;
        int mid = lo + (hi-lo)/2;
        if(arr[mid]==tar){
            ans = mid;
            return foccur(arr, tar, lo, mid-1, ans);
        }
        else if(arr[mid]>tar) return foccur(arr, tar, lo, mid-1, ans);
        else return foccur(arr, tar, mid+1, hi, ans);
    }
}
