

public class StringBuilderBasics {
    public static void main(String[] args) {
        
        // Baiscs of String Builder
        StringBuilder s = new StringBuilder();
        s.append("Amit");
        System.out.println(s);
        s.setCharAt(3, 'r');
        System.out.println(s);

        String str = s.toString();  // S stores now the value of string Builder
        System.out.println(str);

        // Deleting an index value
        s.deleteCharAt(1);
        System.out.println(s);
        s.insert(1,'p');
        System.out.println(s);

        s.reverse();
        System.out.println(s);
    }
}
