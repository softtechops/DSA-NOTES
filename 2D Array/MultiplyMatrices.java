public class MultiplyMatrices {
    public static void main(String[] args) {
        
        int[][]arr = {{2,3,},{5,7}};
        int[][] brr = {{1,3},{8,9}};

        int a = arr.length;

        int[][] c = new int[a][a];

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                for(int k=0; k<a; k++){
                    c[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
