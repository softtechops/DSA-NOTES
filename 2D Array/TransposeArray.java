

public class TransposeArray {
    public static void main(String[] args) {
        // Transpose Of matrix
        // example
        // Example : 
        /*  2 7 5 3 
            8 2 5 1 
            3 1 4 8 
            9 4 5 1
              */
        
        // output ->
        /*  2 8 3 9
            7 2 1 4 
            5 5 4 5
            3 1 8 1 */

        int[][] arr = {{2,7,5,3},{8,2,5,1},{5,5,4,5},{3,1,4,8}};
        
        // Approach to solve this problem
        // 1. Swap i wih j and make sure j runs from i+1 so that it don't reverse the swapping

           for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
           }


           // Printing the array 
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[0].length; j++) {
                   System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
    }
}
