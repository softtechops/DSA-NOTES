public class WaveArray {
    public static void main(String[] args) {
        

        // Wave Array problem
        /*Given a sorted array arr[] of integers (in ascending order), rearrange the elements in-place to form a wave-like array.
        An array is said to be in wave form if it satisfies the following pattern: arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ...
        In other words, every even-indexed element should be greater than or equal to its adjacent odd-indexed elements (if they exist).

        Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

        Input: arr[] = [1, 2, 3, 4, 5]
        Output: [2, 1, 4, 3, 5]
        Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

        Input: arr[] = [2, 4, 7, 8, 9, 10]
        Output: [4, 2, 8, 7, 10, 9]
        Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9. */


        int[] arr = {2, 4, 7, 8, 9, 10, 11};

        // Approach to solve the poblem 
        // swap the first number with second number and 3rd with 4th and so on till the array length
        
        for(int i=0; i<arr.length-1; i=i+2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            
        }

        for (Object elem : arr) {
            System.out.print(elem+" ");
        }
    }
}
