public class StringCompression {
    public static void main(String[] args) {
        

        // String Compression Problrm
        /*Given an array of characters chars, compress it using the following algorithm:

        Begin with an empty string s. For each group of consecutive repeating characters in chars:

        If the group's length is 1, append the character to s.
        Otherwise, append the character followed by the group's length.
        The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
         Note that group lengths that are 10 or longer will be split into multiple characters in chars.

        After you are done modifying the input array, return the new length of the array.

        You must write an algorithm that uses only constant extra space.

        Note: The characters in the array beyond the returned length do not matter and should be ignored.

        

        Example 1:

        Input: chars = ["a","a","b","b","c","c","c"]
        Output: 6
        Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
        After modifying the input array in-place, the first 6 characters of chars should be ["a","2","b","2","c","3"].
        Example 2:

        Input: chars = ["a"]
        Output: 1
        Explanation: The only group is "a", which remains uncompressed since it is a single character.
        After modifying the input array in-place, the first character of chars should be ["a"]. */

        char[] ch = {'a','a','a','a','a','a','a','a','a','a','a','a'};

        int n = ch.length;
        
        // StringBuilder s = new StringBuilder();

        // int i=0,j=1;
        
        // while(j<ch.length){
        //     if(ch[i]==ch[j]){
        //         j++;
        //     }
        //     else{
        //         int len =j-i;
        //         if(len>1){
        //             s.append(ch[i]);
        //             s.append(len);
        //         }
        //         else{
        //             s.append(ch[i]);
        //         }
        //         i=j;
        //         j++;
        //     }
        // }

        // int len =j-i;
        //         if(len==1){
        //             s.append(ch[i]);
        //         }
        //         else{
        //             s.append(ch[i]);
        //             s.append(len);
        //         }

        // System.out.println(s);

        // Leet Code Solution

        int write = 0;
        int i=0,j=1;
        while(j<ch.length){
            if(ch[i]==ch[j]){
                j++;
            }
            else{
                int len = j-i;
                if(len>1){
                    char temp = ch[i];
                    ch[write] = temp;
                    write++;
                    String str = Integer.toString(len);
                    for(int k=0; k<str.length(); k++){
                        ch[write] = str.charAt(k);
                        write++;
                    }
                }
                else{
                    char temp = ch[i];
                    ch[write] = temp;
                    write++;
                }
                i=j;
                j++;
            }
        }

    
                int len = j-i;
                if(len>1){
                    char temp = ch[i];
                    ch[write] = temp;
                    write++;
                    String str = Integer.toString(len);
                    for(int k=0; k<str.length(); k++){
                        ch[write] = str.charAt(k);
                        write++;
                    }
                }
                else{
                    char temp = ch[i];
                    ch[write] = temp;
                    write++;
                }
                
                for(int l=0; l<ch.length; l++){
                    System.out.print(ch[l]+" ");
                }
                System.out.println(write);
                System.out.println(write);
                

    }
}
