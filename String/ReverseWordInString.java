public class ReverseWordInString {
    public static void main(String[] args) {
        
        // Reverse Word in String problem
        // leetcode -> 151
        /*Given an input string s, reverse the order of the words.

        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

        

        Example 1:

        Input: s = "the sky is blue"
        Output: "blue is sky the"
        Example 2:

        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces. */

        String s =  "  hello world  ";

        StringBuilder str = new StringBuilder();

        int j = s.length()-1 , i = s.length()-1;

        while(j>=0){

            while(j>=0 && s.charAt(j)==' '){
                j--;
            }

            if(j<0) break;

            i=j;

            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }

            for(int k = j+1; k <= i; k++){
                str.append(s.charAt(k));

            }

            str.append(' ');

        }

        if(str.length()>0) str.deleteCharAt(str.length()-1);

        String ans = str.toString();

        System.out.println(str);
    }
}
