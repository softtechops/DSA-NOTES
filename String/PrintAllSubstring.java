public class PrintAllSubstring {
    public static void main(String[] args) {
        

        // Printing all substring
        // for eg . String = gopi
        // Substring are -> g ,go , gop ,gopi, o, op, opi ,p ,pi ,i

        String s = "gopi";

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i, (j))+" ");
            }
        }
    }
}
