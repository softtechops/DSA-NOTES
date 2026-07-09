public class GCDForLoop {
    public static void main(String[] args) {
        
        int n = 24;
        int m = 18;
        int mid = -1;
        for(int i = 18; i>=0; i--){
            if(n%i==0 && m%i==0){
                mid = i;
                break;
            }
        }

        System.out.println(mid);
    }
}
