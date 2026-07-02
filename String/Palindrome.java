    import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            
            // palindrome Problem 

            /* Given a string s, return true if the string is a palindrome. Otherwise, return false.

            A string is considered a palindrome if it reads the same forwards and backwards.

            Examples :

            Input: s = "abba"
            Output: true
            Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
            Input: s = "abc" 
            Output: false
            Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome. */

            Scanner sc = new Scanner(System.in);
            char[] ch = {'a','b','b','a'};

            char[] copy = ch.clone();

            boolean palindrome = true;

            int i=0,j=ch.length-1;
            while(i<j){
                if(ch[i]!=ch[j]){
                    palindrome = false;
                    break;
                }
                i++;
                j--;

            }

            if(palindrome) System.out.println("Palindrome ");
            else System.out.println("Not Palindrome");
   
        }
    }
