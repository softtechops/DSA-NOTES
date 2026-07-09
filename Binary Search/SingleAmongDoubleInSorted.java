public class SingleAmongDoubleInSorted {

    public static int SingleAmong(int[] arr){

        if(arr.length%2==0) return -1;
        if(arr.length==1) return arr[0];

        if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];

        int low = 1;
        int high = arr.length-2;

        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return mid;
            }
            else if(mid%2!=0){
                if(arr[mid]==arr[mid+1]){
                    high = mid-1;
                }
                else if(arr[mid]==arr[mid-1]){
                    low = mid+1;
                }
            }
            else if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    low = mid+2;
                }
                else if(arr[mid]==arr[mid-1]){
                    high = mid-2;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        

        // Single Among Double in a Sorted Array

        /*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

        Return the single element that appears only once.

        Your solution must run in O(log n) time and O(1) space.

        

        Example 1:

        Input: nums = [1,1,2,3,3,4,4,8,8]
        Output: 2
        Example 2:

        Input: nums = [3,3,7,7,10,11,11]
        Output: 10 */

        // Approach to Solve 
        // Dekh le bhai samjha jayega 

        // Optimal solution 


        int[] arr = {1,1,2,2,3,4,4};
        int ans = SingleAmong(arr);
        System.out.println(arr[ans]);

         // Optimal solution 
        
        int lo = 0, hi = arr.length-1;
        int idx = -1;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            
            // Check if mid is the single element array
            if(arr[mid]!=arr[mid+1]  && arr[mid] != arr[mid-1]){
                idx = mid;
                break;
            }

            // Two Variable to Check the first and last occurence of element 
            int f = mid ,s = mid;
            if(arr[mid]==arr[mid-1]) f = mid-1;
            else s = mid + 1;  // arr[mid]==arr[mid+1]

            int len = lo  - f;
            if(len%2==0) lo = mid+1;
            else hi = mid-1;

        }

        System.out.println(arr[idx]);
    }
}
