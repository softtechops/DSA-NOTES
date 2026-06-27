



public class SnakePatternWithCols {
    public static void main(String[] args) {
        

        // Snake Patter by Columns Wise

        // Example : 
        /*  2 7 5 3 
            8 2 5 1 
            3 1 4 8 
            4 6 1 2 
            7 3 4 6  */

        // Output ->
        /* 2 8 3 4 7
           3 6 1 2 7
           5 5 4 1 4
           3 2 8 1 3 */

        int[][] arr = {{ 1, 2, 3, 4, 5 },
            { 5, 3, 1, 4, 2 },
            { 5, 6, 7, 8, 9 },
            { 0, 6, 3, 4, 1 },
            };
            
            for(int i=0; i<arr[0].length; i++){
                if(i%2==0){
                    for(int j=0; j<arr.length; j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=arr.length-1; j>=0; j--){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            }
                }
                
    }
