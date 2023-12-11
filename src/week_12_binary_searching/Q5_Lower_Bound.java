package week_12_binary_searching;

public class Q5_Lower_Bound {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,3,3,4,4,8,12};
        System.out.println(lowerBound(a, 4));
    }
    static int lowerBound(int a[], int key){
        int l = 0, r = a.length-1;
        int ans = -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(a[m] >= key) r = m - 1;
            else {
                ans = m;
                l = m + 1;
            }
        }return ans;
    }
}
