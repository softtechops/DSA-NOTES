public class ChangeTheString {
    public static void main(String[] args) {
        
        // Change the string
        /*Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

        Examples:

        Input: s = "abCD"
        Output: "abcd"
        Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.
        Input: s = "Abcd"
        Output: "ABCD"
        Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase. */

        String s = "BaVdfbs";
        char a = s.charAt(0);

        if(a>=97){
            s = s.toLowerCase();
        }
        else s = s.toUpperCase();

        System.out.println(s);
    }
}
