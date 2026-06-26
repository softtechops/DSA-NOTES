public class MissingArray {
    public static void main(String[] args) {
        
        // Missing Array Problem

        /*
        Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. 
        This array represents a permutation of the integers from 1 to n with one element missing. 
        Find the missing element in the array.

        Examples: 

        Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
        Output: 6
        Explanation: All the numbers from 1 to 8 are present except 6.

        Input: arr[] = [1, 2, 3, 5]
        Output: 4
        Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4 */



        int[] arr = {1,2,3,4,5,7,8}; // No. 6 is missing in the array

        // Approach to solve this problem
        // Calculate the sum from 1 to array length + 1  
        // for eg. 1 to 8
        // Calculate the sum of element in the given array 
        // for eg. 1+2+3+4+5+7+8

        // Now subtract the sum of array length by sum of element in array

        // Calculating the sum of arraylenght + 1
        int n = arr.length+1;
        int sumarr = (n*(n+1))/2;

        // calculating the sum of element in the array
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

        // Subtracting it 
        int misselem = sumarr-sum;
        System.out.println("Missing element is "+misselem);
        
    }
}
