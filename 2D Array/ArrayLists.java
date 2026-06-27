
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        
        // Basics of 2D Array List 

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(17); a.add(7); a.add(5); a.add(18); 
        
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(3); b.add(5); b.add(7);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(2); c.add(3); c.add(5); c.add(7); c.add(11); c.add(13); c.add(17);

        arr.add(a); arr.add(b); arr.add(c);

        // To get a element 
        int n = arr.get(1).get(2);
        System.out.println(n);

        // To set element 
        arr.get(1).set(2, 13);

        // To add element 
        arr.get(0).add(9);


        // To print the array using for each loop

        for (ArrayList<Integer> list : arr) {
            for (int elem : list) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }

        // To print the arraylist using for loop
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
