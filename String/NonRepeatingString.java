public class NonRepeatingString {
    public static void main(String[] args) {
        

        // Non Repeating Problem Leetcode no -> 387    

        /*Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. 
        If there is no non-repeating character, return '$'.

        Examples:

        Input: s = "geeksforgeeks"
        Output: 'f'
        Explanation: In the given string, 'f' is the first character in the string which does not repeat.
        Input: s = "racecar"
        Output: 'e'
        Explanation: In the given string, 'e' is the only character in the string which does not repeat.
        Input: s = "aabbccc"
        Output: '$'
        Explanation: All the characters in the given string are repeating. */

        String s = "leetcode";


        int[] arr = new int[26];
        boolean found = false;

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
        }

        for(int i=0; i<s.length(); i++){
             int idx = s.charAt(i) - 'a';
             if(arr[idx]==1){
                found = true;
                System.out.println(i);
                char ans = s.charAt(i);
                System.out.println(ans);
                break;
             }
        }

        if(!found){
            System.out.println("Not found ");
        }

    }
}
