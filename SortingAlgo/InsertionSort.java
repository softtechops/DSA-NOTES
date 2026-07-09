public class InsertionSort {
    public static void main(String[] args) {
        

        // Insertion Sort Algorithm

        int[] arr = {5,5,8,56,8,56,8,5,2};

        for(int i=0; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }
}
