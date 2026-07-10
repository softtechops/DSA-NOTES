public class RecursionOnArray {
    public static void main(String[] args) {
        
        // Recursively Printing array

        int[] arr = {5,8,6,5,8,69,47,15,3};

        // recPrint(arr,0);
        System.out.println(exist(arr, 47, 0));
    }

    // public static void recPrint(int[] arr , int idx){
    //     if(idx==arr.length) return;
    //     System.out.print(arr[idx]+" ");
    //     recPrint(arr, idx+1);
    // }

    // To print reverse
    // public static void recPrint(int[] arr , int idx){
    //     if(idx==arr.length) return;
    //     recPrint(arr, idx+1);
    //     System.out.print(arr[idx]+" ");
    // }

    // To perform Linear Search 

    public static boolean exist(int[] arr , int ele, int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return  exist(arr, ele, idx+1);
    }
}
