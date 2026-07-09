

public class BubbleSortReverse {
    public static void main(String[] args) {
        

        // array ko descendig order me sort karn hai
        // arr = 10 5 4 3 1

        int[] arr = {1,2,8,5,4,9,6,7,2,4,1,5,5};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }

            if(swap==0) break;
        }

        for (Object elem : arr) {
            System.out.print(elem+" ");
        }
    }
}
