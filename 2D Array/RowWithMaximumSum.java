

public class RowWithMaximumSum {

    public static int add(int[][] arr,int index){
        int sum=0;
        for(int i=0; i<arr[index].length; i++){
            sum+= arr[index][i];
        }
        return sum;
    }

    
    public static void main(String[] args) {
        
        // Find the row with the maximum sum

        /*Given an N*N matrix. The task is to find the index of a row with the maximum sum.
         That is the row whose sum of elements is maximum. */

        int[][] arr = 
            {{ 1, 2, 3, 4, 5 },
            { 5, 3, 1, 4, 2 },
            { 5, 6, 7, 8, 9 },
            { 0, 6, 3, 4, 12 },
            { 9, 7, 12, 4, 3 },
            };

            int check = Integer.MIN_VALUE;
            int row =-1;
            int currentSum =0;

            for(int i =0; i<arr.length; i++){
                currentSum = add(arr, i);
               if(currentSum>check){
                check = currentSum;
                row = i;
               }

            }

            System.out.println("maximum element "+check+" Row no. "+row);


            // Optimal Solution 


            // for(int i=0; i<arr.length; i++){
            //     int sum = 0;
            //     for(int j=0; j<arr[0].length; j++){
            //         sum+=arr[i][j];
            //     }
            //     if(sum>maxsum){
            //         maxsum = sum;
            //         row = i;
            //     }
            // }

            
    }
}
