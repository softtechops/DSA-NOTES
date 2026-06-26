
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        
        // basics of Array list

        // Why ArrayList ? Why do we need it and what's the diffence between array and arraylist ?
        // Beacuse array list can grow his size while array remains the size fixed
        ArrayList<Integer> arr = new ArrayList<>();
        // adding the element in array

        arr.add(10);
        arr.add(21);
        arr.add(73);
        arr.add(25);

        //  adding the element to a particular index
        arr.add(1,63);

        // array size 
        int size = arr.size();

        // printing the arraylist
        System.out.println(arr);

        // getting a particular element from the index
        System.out.println(arr.get(3));
    }
}
