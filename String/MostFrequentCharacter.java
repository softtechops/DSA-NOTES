
public class MostFrequentCharacter {
    public static void main(String[] args) {
        

        // Brute froce 
        String s = "character";
        // int maxFreq = -1;
        // char ans = s.charAt(0);

        // for(int i=0; i<s.length(); i++){
        //     int count = 0;
        //     char ch = s.charAt(i);
        //     for(int j=i+1; j<s.length(); j++){
        //         if(ch==s.charAt(j)){
        //             count++;
        //         }
        //     }
        //     if(count>maxFreq){
        //         maxFreq = count;
        //         ans = ch;
        //     }
        //     else if(count==maxFreq && ch<ans){
        //         ans = ch;
        //     }
        // }
        // System.out.println(ans);



        // Sliding Window Solution
        // int maxFreq = -1;
        // char[] ch = s.toCharArray();
        // Arrays.sort(ch);
        // char ans = s.charAt(0);
        // int i=0,j=0;
        // while(j<s.length()){
        //     if(ch[i]==ch[j]) j++;
        //     else{
        //         int len = j-i;
        //         if(len>maxFreq){
        //             maxFreq =  len;
        //             ans = ch[i];
        //         }
        //         i=j;
        //     }
        // }

        // int len = j-i;
        //         if(len>maxFreq){
        //             maxFreq =  len;
        //             ans = ch[i];
        //         }

        // System.out.println(ans);


        // Best Optimized Solution
        int maxFreq = -1;
        char ans = s.charAt(0);
        int[] arr = new int[26];
        for(int  i=0; i<s.length(); i++){
            int k = s.charAt(i)-97;
            arr[k]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxFreq){
                maxFreq = arr[i];
                int charval = i + 97;
                ans = (char) charval;
            }
        }

        System.out.println(ans);

        


    }
}
