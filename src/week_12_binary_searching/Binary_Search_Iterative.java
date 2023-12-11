package week_12_binary_searching;

public class Binary_Search_Iterative {
    public static void main(String[] args) {
        int a[] = {2,3,5,7,8,9};
        System.out.println(binarySearchIterative(a,20));
    }
    static int binarySearchIterative(int a[], int key){
        int l = 0, r = a.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(key == a[mid]) return mid;
            else if (key > a[mid]) l = mid + 1;
            else r = mid - 1;
        }return -1;
    }
}
