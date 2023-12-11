package week_12_binary_searching;

public class Q4_Upper_Bound {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,3,3,4,4,8,12};
        System.out.println(upperBound(a, 13));
    }
    static int upperBound(int a[], int key){
        int l = 0, r = a.length-1;
        int ans = a.length;
        while (l <= r){
            int m = l + (r-l)/2;
            if(a[m] <= key) l = m + 1;
            else {
                ans = m;
                r = m - 1;
            }
        }return ans;
    }
}
