

    public class TwoSum {
        public static void main(String[] args) {
            
            // Two Sum Problem 
            /* Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target. 
            This is a variation of the 2-Sum problem.

            Examples: 

            Input: arr[] = [0, -1, 2, -3, 1], target = -2
            Output: true
            Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.

            Input: arr[] = [1, -2, 1, 0, 5], target = 0
            Output: false
            Explanation: There is no pair with sum equals to given target. */

            int arr[] = {2,42,45,6,5,43,13,7};

            int target = 7;
            boolean found =false;

            for (int i = 0; i < arr.length; i++) {
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]+arr[j] == target){
                        System.out.println("Index no. are "+i+"and "+j);
                        found = true;
                        break;
                    
                    }
                    
                }
                if(found) break;
            }
            if(!found) System.out.println("There is no pair in the array");




        }
    }
