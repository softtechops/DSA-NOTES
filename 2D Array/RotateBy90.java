

public class RotateBy90 {
    public static void main(String[] args) {
        

        // Rotate by 90 Problem 

        /*Given a square matrix mat[][], turn it by 90 degrees in an clockwise direction without using any extra space

        Examples: 

        Input: mat[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}}
        Output: {7, 4, 1}, 
                {8, 5, 2}, 
                {9, 6, 3} 

        Input: mat[][] ={1, 2, 3, 4},
                        {5, 6, 7, 8}, 
                        {9, 10, 11,12}
                        {13, 14, 15, 16}}


        Output: {{13, 9, 5, 1}, 
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4} */

                int[][] arr = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

                // Approach to solve this problem ->
                // 1. Transpose the matrix
                // 2. Reverse the element of each row

                for(int i=0; i<arr.length; i++){
                    for(int j=i+1; j<arr[0].length; j++){
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }

                // Reverse the element of each row 
                for(int i=0; i<arr.length; i++){
                    int k=0,j=arr[0].length-1;
                    while(k<j){
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = temp;
                        k++;
                        j--;
                    }
                }

                for(int i=0; i<arr.length; i++){
            for(int k=0; k<arr[0].length; k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }


                
    }
}
