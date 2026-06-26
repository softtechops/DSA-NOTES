import java.util.Arrays;
public class TwoSumUsingOn {
    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        int target =-2;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            if(arr[i]+arr[j]<target){
                i++;
            }
            if(arr[i]+arr[j]==target){
                System.out.println("Pair found. Index no are "+i+" and "+j);
                break;
            }
        }

        
    }
}
