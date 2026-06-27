

public class ReverseAllRow {
    public static void main(String[] args) {
        
        // Reverse all row 
    /* 
        2 4 1 3 5 
        5 6 7 8 9 
        1 4 3 6 0 
        9 7 1 4 3 */

    // Output will be ->
    /* 5 3 1 4 2
       9 8 7 6 5
       0 6 3 4 1
       3 4 1 7 9 */

     int[][] arr = {{ 1, 2, 3, 4, 5 },
            { 5, 3, 1, 4, 2 },
            { 5, 6, 7, 8, 9 },
            { 0, 6, 3, 4, 1 },
            { 9, 7, 12, 4, 3 },
            };


        for(int k=0; k<arr.length; k++){
            int i=0; int j=arr[k].length-1;
            while(i<j){
                int temp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = temp;
                i++;
                j--;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
