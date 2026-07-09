import java.util.ArrayList;
import java.util.Arrays;

public class CommonElemetsTwoArray {
    public static void main(String[] args) {
        
        // common elements between two arrays
       int a[] = {3, 6, 1, 7, 9, 8, 2, 2} , b[] = {9, 7, 3, 4, 9};

       Arrays.sort(a);
       Arrays.sort(b);

       ArrayList<Integer> arr = new ArrayList<>();
       int i = 0, j=0;

       while(i<a.length &&  j<b.length){
        if(a[i]==b[j]){
            arr.add(a[i]);
            i++;
            j++;
        }
        else if(a[i]>b[j]){
            j++;
        }
        else if(a[i]<b[j]) i++;
       }
       
       System.out.println(arr);
    }
}
