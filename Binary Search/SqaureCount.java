public class SqaureCount {
    public static void main(String[] args) {
        
        int sqaure = 11;
        int low = 0, high = sqaure;
        int idx = -1;


        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid == sqaure){
                idx = mid;
                break;
            }
            else if(mid*mid>sqaure){
                high = mid-1;
            }
            else if(mid*mid< sqaure){
                low = mid+1;
            }
        }

        if(idx!=-1) System.out.println(idx);
        else System.out.println(high);
    }
}
