

public class FirstOccurence {
    public static void main(String[] args) {
        

        // First Occurence problem

        int[] arr = {2,2,2,2,2,2,2,2};
        int target = 2;
        int found = -1;

        int low = 0; 
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high = mid -1;
            else if(arr[mid]<target) low = mid +1;
            else{
                found = mid;
                high = mid-1;
            }
        }
        System.out.println(found);
    }
}
