public class CompareToString {

    public static int compare(String a , String b){
        int i=0;
        int count =0;
        while(i<a.length() && i<b.length()){
            if(a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
          
             }
             i++;
         }

        if(i==a.length() && i==b.length()){
            return 0;
        }

        else if(i==a.length()){
            while(i<b.length()){
                count--;
                i++;
            }
            return count;
        }
        else {
            while(i<a.length()){
                count++;
                i++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        
        // Compare to function

        String a = "Raghu";
        String b = "Raghav";

        int n = compare(a, b);
        System.out.println(n);
    }
}
