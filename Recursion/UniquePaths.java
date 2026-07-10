public class UniquePaths {
    public static void main(String[] args) {
        
        // Unique Path Problem
        // Leetcode -> 62

        int ans = path(2, 6);
        System.out.println(ans);


    }

        // Optimal Way Solution
    public static int path(int m , int n){
        if(m==0 || n==0) return 1;
        return path(m-1,n) + path(m, n-1);
    }

    // public static int path(int m , int n){
    //     if(m==0 && n==0) return 1;
    //     if(m==0 && n!=0) return path(m,n-1);
    //     if(n==0 && m!=0) return path(m-1,n);
    //     return path(m-1,n) + path(m, n-1);
    // }
}
