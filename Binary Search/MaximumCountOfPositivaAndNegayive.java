public class MaximumCountOfPositivaAndNegayive {
    public static void main(String[] args) {
        

        // Maximum Count Of Positive And Negative Integer
        // LeetCode ->2529
        int[] arr = {-3,-2,-1,0,0,1,2,5,20,66,1314};

        int low = 0,high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<0){
                low = mid+1;
            }
            else if(arr[mid]>0){
                high = mid-1;
            }
            else high = mid -1;
        }

        int negNum = low;
        
        low = 0;
        high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<0){
                low = mid+1;
            }
            else if(arr[mid]>0){
                high = mid-1;
            }
            else low = mid+1;
        }
        high = high+1;
         int posNum = arr.length - high;

         int max = Math.max(negNum, posNum);
         System.out.println(max);
    }
}
