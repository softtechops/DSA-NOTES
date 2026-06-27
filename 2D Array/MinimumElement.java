

public class MinimumElement {
    public static void main(String[] args) {
        
        // find the minimum element out of all the maximum elements of each row
        // for eg. 2 3 7 5  max elem -> 7
        //         4 6 7 9  max elem -> 9
        //         2 8 3 5  max elem => 8

        // Now max elem -> 7 8 9 
        // we have to find minimum element from the max element
        // minimum elem -> min(7 8 9) -> 7

        int[][] arr =  {{ 1, 2, 3, 4, 5 },
            { 5, 3, 1, 4, 2 },
            { 5, 6, 7, 8, 9 },
            { 0, 6, 3, 4, 12 },
            { 9, 7, 12, 4, 3 },
            };

        int min = Integer.MAX_VALUE;
        int row = -1;

        for(int i=0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<arr[0].length; j++){

                if(arr[i][j]>max) max = arr[i][j];
            }
            if(max<min){
                min = max;
                row = i;
            }
        }

        System.out.println(min);
        System.out.println(row);
    }
}
