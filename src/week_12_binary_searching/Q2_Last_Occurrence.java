package week_12_binary_searching;

public class Q2_Last_Occurrence {
    public static void main(String[] args) {
        int a[] = {5,5,5,8,9,9,15,16};
        System.out.println(lastOccurrence(a,115));
    }
    static int lastOccurrence(int a[], int key){
        int l = 0, r = a.length-1;
        int ans = 0;
        while (l <= r){
            int mid = l + (r-l)/2;
            if(key == a[mid]){
                ans = mid;
                l = mid+1;
            }else if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }return ans;
    }
}
