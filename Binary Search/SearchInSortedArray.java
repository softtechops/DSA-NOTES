public class SearchInSortedArray {
    public static void main(String[] args) {
        

        // Search In 2D Sorted Array

        int [][] arr = {{1,6,12,27,32},{38,41,47,49,55},{67,68,75,76,81},{84,89,91,92,98}};
        int target = 41;
        int m = arr.length;
        int n = arr[0].length;
        int lo = 0, hi = (m*n) -1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int row = mid/n, col = mid%n;
            if(arr[row][col]==target){
                System.out.println(row+" " + col);
                break;  
            }
            else if(arr[row][col]>target) hi = mid-1;
            else lo = mid+1;
        }
    }
}
