public class StringTOCharArray {
    public static void main(String[] args) {
        

        // Convert the String into Char Array

        String s = "JavaLanguage";

        char[] ch = s.toCharArray();

        // iskoHumCamelCaseKehteHai
        // IskoHumPascalCaseKehteHai

        for(char elem : ch){
            System.out.println(elem);
        }
    }
}
