

public class CheckifArrayisSorted {
    public static void main(String[] args) {
        
        // Check whether array is sorted or not
         int[] arr = {90,80, 100, 70, 40, 30};
         boolean check = true;

         for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                check = false;
                break;
            }
         }

         if(check) System.out.println("Array is Sorted"); 
         else System.out.println("Array is not Sorted");
    }   
}
