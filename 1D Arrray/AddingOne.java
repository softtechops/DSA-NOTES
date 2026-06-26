
import java.util.ArrayList;

public class AddingOne {
    public static void main(String[] args) {
        
        // Adding One Problem
        /*Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

        Examples:

        Input: arr[] = [5, 6, 7, 8]
        Output: [5, 6, 7, 9]
        Explanation: 5678 + 1 = 5679
        Input: arr[] = [9, 9, 9]
        Output: [1, 0, 0, 0]
        Explanation: 999 + 1 = 1000 */


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        boolean lastindex = true; // Track the record whether it breaks loop before reaching the index or not

        for(int i = arr.size()-1; i>=0; i--){
            if(arr.get(i)==9) arr.set(i, 0);
            else{
                arr.set(i,arr.get(i)+1);
                lastindex = false;
                break;
            }
        }
        if(lastindex) arr.add(0,1); // adding one if the last index becomes zero due to addition 
        System.out.println(arr);
    }
}
