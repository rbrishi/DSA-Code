package week_12_binary_searching;

public class Q6_Search_In_Sorted_Rotated_Array {
    public static void main(String[] args) {
        //int a[] = {3,4,5,6,7,0,1,2};
        int a[] = {10,10,13,2,2,2,4,7,7,9};
        System.out.println(searchInSortedRotatedArray(a,9));
    }
    static int searchInSortedRotatedArray(int a[], int key){
        int l = 0, r = a.length-1;
        while (l <= r){
            int m = l + (r-l)/2;
            if(a[m] == key) return m;
            if(a[m] == a[l] && a[m] == a[r]){  //for duplicate ele
                l++;
                r--;
            }
            else if(a[l] <= a[m]){ //left part is sorted
                //now check key lies in left region or not
                if(a[l] <= key && key < a[m])  r = m - 1;
                else  l = m + 1;
            }else {  //right part is sorted
                if(a[m] < key && key <= a[r]) l = m + 1;
                else r = m - 1;
            }
        }return -1;
    }
}
