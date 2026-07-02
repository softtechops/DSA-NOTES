public class ReverseEachWordInString {
    public static void main(String[] args) {
        

        // Reverse Each Word In String
        /*You are given a string s. You need to reverse each word in it where the words are separated by spaces and return the modified string.

        Note: The string may contain leading or trailing spaces, or multiple spaces between two words. The returned string should only have a single space separating the words, and no extra spaces should be included.

        Examples:

        Input: s = " i like this program very much "
        Output: "i ekil siht margorp yrev hcum"
        Explanation: The words are reversed as follows:
        "i" -> "i","like"->"ekil",
        "this"->"siht","program" -> "margorp",
        "very" -> "yrev","much" -> "hcum". */

        String s = " i like this program very much ";

        StringBuilder str = new StringBuilder();
        
        int i=0,j=0;
        while(j < s.length()){

            // Skip all spaces 
            while(j < s.length() && s.charAt(j)==' '){
                    j++;
                }

                // No more words
                if(j==s.length()) break;

                // Start of current word
                i =j;

                // Find the end of current word
                  
            while(j < s.length() && s.charAt(j)!=' '){
                    j++;
            }

            // Reverse Current Word
            for(int k=j-1; k>=i; k--){
                str.append(s.charAt(k));
            }

            // Append extra space after the word
            str.append(' ');
        }
        
        // Remove extra space at the last one
        if(str.length()>1) str.deleteCharAt(str.length()-1);

        System.out.println(str);
    }
}
