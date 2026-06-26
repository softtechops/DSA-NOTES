public class RotateArray {
    
    
    // Function to reverse the array 
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        
        // Rotate an array
        /*Input: arr[] = [1, 2, 3, 4, 5, 6], d = 2
        Output: [3, 4, 5, 6, 1, 2]
        Explanation: After first left rotation, arr[] becomes [2, 3, 4, 5, 6, 1] and after the second rotation, arr[] becomes [3, 4, 5, 6, 1, 2]

        Input: arr[] = [1, 2, 3], d = 4
        Output: [2, 3, 1]
        Explanation: The array is rotated as follows:

        After first left rotation, arr[] = [2, 3, 1]
        After second left rotation, arr[] = [3, 1, 2]
        After third left rotation, arr[] = [1, 2, 3]
        After fourth left rotation, arr[] = [2, 3, 1] */

        int arr[] = {1,2,3,4,5,6,7,8};
        int d = 15;
        d = d%arr.length; // dividing the d by array length to get smaller number than array length

        // Apporoach to solve this question
        // Reverse the array from 0 to d-1 
        // Reverse the array from d to arraylength-1
        // Now reverse the whole array from 0 to arraylength-1
    

        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);


        for (Object elem : arr) {
                System.out.print(elem+" ");
        }

    }
    
}
