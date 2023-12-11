package week_12_binary_searching;

public class Q3_Count_The_Occurrence {
    public static void main(String[] args) {
        //int a[] = {5,5,5,8,9,9,9,9,9,15,16};
        int a[] = {1,1,1,1};
        System.out.println(countOccurrence(a,1));
    }
    static int countOccurrence(int a[], int key){
        if(firstOccurrence(a,key) == -1) return 0;
        return lastOccurrence(a,key) - firstOccurrence(a, key) + 1;
    }
    static int firstOccurrence(int a[], int key){
        int l = 0, r = a.length-1;
        int ans = 0;
        while (l <= r){
            int mid = l + (r-l)/2;
            if(key == a[mid]){
                ans = mid;
                r = mid-1;
            }else if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }return ans;
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
