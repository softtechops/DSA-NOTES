public class Plus {
    public static void main(String[] args) {
        

        // Plus Operator in Java 

        String a = "Ansh";
        String b = "Singh";

        a +=b;  // Concat two string a = Ansh + Singh
        System.out.println(a);
        a = 10+a;  // Integer + String => String Kyuki String ki aaukat jada hai
        System.out.println(a);
        
        a = a + " Bhakti hi sakti hai";
        System.out.println("Ta"+10+20);  // Output -> Ta1020  Kyuki java left to right jata hai
        // Ta + 10 -> String + int -> String fir  Ta10+20 -> Ta1020

        System.out.println('A'+10+"Raghav");
        // Ouput => 75Raghav 
        // Explanation : Kyuki char + int me int ki aaukat jada hai so char ki ascii value add hogi 
        // 'A'+ 10 -> 65 + 10 -> 75 + "Raghav => 75Raghav"
    }
}
