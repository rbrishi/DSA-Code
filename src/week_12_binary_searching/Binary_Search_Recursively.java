package week_12_binary_searching;

public class Binary_Search_Recursively {
    public static void main(String[] args) {
        int a[] = {2,3,5,7,8,9,11,16};
        System.out.println(binarySearchRecursively(a,11,0,a.length-1));
    }
    static int binarySearchRecursively(int a[], int key, int l, int r){
        if(l > r) return -1;

        int mid = l + (r-l)/2;

        if(a[mid] == key) return mid;
        else if (a[mid] < key) return binarySearchRecursively(a,key,mid+1,r);
        else return binarySearchRecursively(a, key, l, mid-1);
    }
}
