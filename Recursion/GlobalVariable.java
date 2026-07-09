

public class GlobalVariable {
    static int k = 8;
    public static void main(String[] args) {
        
        // Global variable Concept
        k = 7;
        System.out.println(k);
        main1();

    }
    static void main1() {
    
        k = 9;
        System.out.println(k);
    }
}
