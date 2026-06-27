

public class SnakePattern {
    public static void main(String[] args) {
        
        // Snake Pattern Problem
        /*  2 7 5 3 
            8 2 5 1 
            3 1 4 8 
            4 6 1 2 
            7 3 4 6  */

        // Snake pattern will be ->
        /* 2 7 5 3
           1 5 2 8
           3 1 4 8
           2 1 6 4
           7 3 4 6
         */

           int[][] arr = {{ 1, 2, 3, 4, 5 },
            { 5, 3, 1, 4, 2 },
            { 5, 6, 7, 8, 9 },
            { 0, 6, 3, 4, 1 },
            { 9, 7, 12, 4, 3 },
            };

            for(int i=0; i<arr.length; i++){
                if(i%2==0){
                    for(int j = 0; j<arr[i].length; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                else{
                    for(int j = arr[i].length-1; j>=0; j--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }

    }
}
