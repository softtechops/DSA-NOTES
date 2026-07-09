public class SearchInRotatedArray {

    public static int search(int[] arr , int target,int lo,int hi){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return arr[mid];
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        

        // Search In Rotated Array

        int arr [] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 7;

        // Finding the peak element 
        int lo = 0, hi = arr.length-1;
        int ans=-1;
        int peak = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1] && mid>0 && mid<arr.length){
                peak = mid;
                break;
            }
            else if(arr[mid]<arr[mid-1] && mid>0 && mid<arr.length){
                hi = mid-1;
            }
            else if(arr[mid]<arr[mid+1] && mid>0 && mid<arr.length) lo = mid+1;
        }

        if(arr[arr.length-1]<target){
            ans = search(arr, target,0,peak);
        }
        else ans = search(arr, target,peak+1, arr.length-1);

        System.out.println(ans);
    }
}
