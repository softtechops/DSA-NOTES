public class SpirallyTravserse {
    public static void main(String[] args) {
        
        // Spirally Traverse Leetcode no -> 54

        int [][] arr = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        
        /* You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

        Examples:

        Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
        Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
        Explanation:  
              1 2 3 4
              5 6 7 8
              9 3 5 7
              8 9 6 3

              Spirally traversel ->
              1 -> 2 -> 3 ->4 
                */
                   



        // Approach to solve this proble 
        //1. Create four variable for first row , last row , first column and last column



        int fr = 0;
        int lr = arr.length-1;
        int fc = 0;
        int lc = arr[0].length-1;

        while(fr<=lr && fc<=lc){
            for(int i=fc; i<=lc; i++){
                System.out.print(arr[fr][i]+" ");
            }
            fr++;
            if(fr>lr || fc>lc) break;

            for(int j=fr; j<=lr; j++){
                System.out.print(arr[j][lc]+" ");
            }
            lc--;
            if(fr>lr || fc>lc) break;

            for(int k=lc; k>=fc; k--){
                System.out.print(arr[lr][k]+" ");
            }
            lr--;
            if(fr>lr || fc>lc) break;

            for(int l=lr; l>=fr; l--){
                System.out.print(arr[l][fc]+" ");
            }
            fc++;
        }
                
        }
    }


