public class SelectionSort {
    public static void main(String[] args) {
        

        // Selection Sort Algorithm

        int[] arr = {2,5,9,7};

        int n = arr.length;
        for(int i=0; i<n; i++){
            int idx = -1;
            int min = Integer.MAX_VALUE;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    idx = j;
                    min = arr[j];
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
