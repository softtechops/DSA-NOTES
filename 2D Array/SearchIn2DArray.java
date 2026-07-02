public class SearchIn2DArray {
    public static void main(String[] args) {
        

        // Search in 2D Array Leetcode no -> 240
        /*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
        This matrix has the following properties:

        Integers in each row are sorted in ascending from left to right.
        Integers in each column are sorted in ascending from top to bottom. 
        
        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
        Output: true*/

        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 12;
        int row = arr.length-1;
        int cols=0;
        boolean found = false;

        while(cols<arr[0].length && row>=0){
             if(arr[row][cols]==target){
                found = true;
                break;
            }
            else if(arr[row][cols]>target) row--;
            else cols++;
        }

        // Printing the array 
          System.out.println(found);
    }
}
