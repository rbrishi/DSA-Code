package week_12_binary_searching;

public class Q1_First_Occurrence {
    public static void main(String[] args) {
        int a[] = {5,5,5,8,9,9,15,16};
        System.out.println(firstOccurrence(a,5));
    }
    static int firstOccurrence(int a[], int key){
        int l = 0, r = a.length-1;
        int ans = -1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if(key == a[mid]){
                ans = mid;
                r = mid-1;
            }else if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }return ans;
    }
}
