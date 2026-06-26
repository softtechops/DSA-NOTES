public class Segregation0sand1s {
    public static void main(String[] args) {
        

        // Segregation of 0s and 1s
        /* Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

        Input : arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
        Output :  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 

        Input : arr[] = [0, 1, 0]  
        Output :  [0, 0, 1] 

        Input : arr[] = [1, 1]  
        Output :  [1, 1] 

        Input : arr[] = [0]  
        Output :  [0]  */


        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0,};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else{
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (Object elem : arr) {
            System.out.print(elem+" ");
        }
    }
}
