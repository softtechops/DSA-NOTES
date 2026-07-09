public class FloorInSortedArray {
    public static void main(String[] args) {
        

        // Floor in Sorted Array 

        int[] arr = {1,3,5,6};
        int target = 2;

        int low = 0, high = arr.length-1;
        boolean found = false;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                found = true;
                break;
            }
            else if(arr[mid]>target){
                 high = mid-1;
            }
            else if(arr[mid]<target){ 
                low = mid+1;
            }
        }

        if(found) System.out.println("Element found in the array");
        else System.out.println(low);
    }
}
