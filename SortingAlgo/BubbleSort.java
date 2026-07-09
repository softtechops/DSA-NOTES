

public class BubbleSort {
    public static void main(String[] args) {
        
        // Bubble Sort Algorithm

        // Alogrithm:
        /*1. Take two element for eg. 1st and 2nd 
          2. Compare both the element
            a. if 1st > 2nd  -> Swap the element 
          
          3. Now take 2nd and 3rd element and goes one 
            */

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (Object elem : arr) {
            System.out.print(elem+" ");
        }
    }
}
