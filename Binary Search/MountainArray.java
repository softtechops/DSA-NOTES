

public class MountainArray {
   public static void main(String[] args) {
    
    // Mountain Array Problem 
    int[] arr = {1,3,5,6,7,8,9,5,4,2};

    int low = 1;
    int high = arr.length-2;
    int max = Integer.MIN_VALUE;
    System.out.println(max);
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1]){
            max = arr[mid];
            break;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            low = mid+1;
        }
        else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
            high = mid-1;
        }
    }

    System.out.println(max);
   } 
}
