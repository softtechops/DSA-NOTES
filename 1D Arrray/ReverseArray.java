public class ReverseArray {
    public static void main(String[] args) {
        

        // Reverse Arrar 
        /*
        Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

        Examples:

        Input: arr[] = [1, 4, 3, 2, 6, 5]  
        Output:  [5, 6, 2, 3, 4, 1]
        Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

        Input: arr[] = [4, 5, 1, 2]
        Output: [2, 1, 5, 4]
        Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on. */


        int arr[] ={3,2,45,64,6,24,4,66,44,34,24,56};
        int temp;
        int i=0,j=arr.length-1;
        while(i<j){
           temp = arr[i];
           arr[i]= arr[j];
           arr[j]=temp;
           i++;
           j--; 
        }
        for (Object elem : arr) {
            System.out.print(elem+" ");
        }

    }
}
