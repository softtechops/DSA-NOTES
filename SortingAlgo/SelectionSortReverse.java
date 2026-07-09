public class SelectionSortReverse {
    public static void main(String[] args) {
        

        // Selection Sort Reverse 
        // Start the array with the largest element

        int[] arr = {2,5,7,9,3,4,8};

        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int idx = -1;
            int max = Integer.MIN_VALUE;
            for(int j=i; j<n; j++){
                if(arr[j]>max){
                    idx = j;
                    max = arr[j];
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (Object elem : arr) {
            System.out.print(elem+" ");
        }
    }
}
