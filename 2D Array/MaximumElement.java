

public class MaximumElement {
    public static void main(String[] args) {
        

        // Maximum element in the matrix

        int[][] arr = {{2,3,6},{41,5,9},{5,8,7}};

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){

                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
