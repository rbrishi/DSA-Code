package week_12_binary_searching;

public class Q7_Find_Square_Root {
    public static void main(String[] args) {
        int n = 113488;
        System.out.println(findSquareRoot(n));
    }
    static int findSquareRoot(int n){
        int l = 1, h = n;
        int ans = -1;
        while (l <= h){
            int m = l + (h-l)/2;
            if(m*m == n) return m;
            if(m*m > n){
                h = m - 1;
            } else if (m*m < n) {
                ans = m;
                l = m + 1;
            }
        }return ans;
    }
}
