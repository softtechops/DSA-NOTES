
import java.util.Scanner;
public class BasicsOf2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        // Basics of 2D Arrays

        // Initialization of array 
        int[][] arr = new int[2][4];

        System.out.println(arr.length); // This represents the lenghth of row in array

        System.out.println(arr[0].length); // This represents the length of column in array

        // Printing the array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Taking Input ]
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.println("Enter the element for" +(i+1)+" row  and "+(j+1)+" cols");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
