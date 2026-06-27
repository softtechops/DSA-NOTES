
import java.util.ArrayList;

public class PascalTraingle {
    public static void main(String[] args) {
        
        // Pascal triangle Problem Leetcode no -> 118
        /*Given an integer numRows, return the first numRows of Pascal's triangle.

        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
        Example 1:

        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        Example 2:

        Input: numRows = 1
        Output: [[1]]
 

    */
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Creation of ArrayList
        for(int i=0; i<5; i++){
               arr.add(new ArrayList<>());
            
        }

        // Initializing each arraylist with 1
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
               arr.get(i).add(1);
            }
        }

        

        // Changing into pascal triangle

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
               if(i==0 || j==i || j==0){
                continue;
               }
               else{
                arr.get(i).set(j,(arr.get(i-1).get(j-1)+arr.get(i-1).get(j)));
               }
            }
        }

        // printing the arraylist
        for (ArrayList<Integer> list : arr) {
            for (int elem : list) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }

    }
}
