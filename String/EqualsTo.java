public class EqualsTo {
    public static void main(String[] args) {
        

        // Equals to -> Function

        // String a = "Amit";
        // String b = "Amit";
        // System.out.println(a==b);  /* Output -> true
        // Explanation : 
        // Isme a aur b same Amit ko point kar rahe hai 
        //  So a aur b ka address same hai isliye true ho rha hai  */


         String a = new String("Amit");
         String b = new String("Amit");

         System.out.println(a==b);
         /*  Output -> False
         Explanation : 
         Isme a ka alag "Amit string address hai 
         aur b ka alag "Amit" string address hai 
         btw a==b humesha address check hota hai rather than string ke character */

         // How to check the character 
         // By using Equals to function
         System.out.println(a.equals(b));


        
    }
}
