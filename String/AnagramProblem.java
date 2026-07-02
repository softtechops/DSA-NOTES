import java.util.Arrays;
public class AnagramProblem {
    public static void main(String[] args) {
        

        // Anagram problem Leetcode -> 242
        String a = "listen";
        String b = "silent";

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean found = true;

        for(int i=0; i<a.length(); i++){
            if(arr1[i]!=arr2[i]){
                found = false;
                break;
            }
        }

        if(found){
            System.out.println("Anagram Found ");
        }
        else{
            System.out.println("Not Anagram");
        }
        
    }
}
