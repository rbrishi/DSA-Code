package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3,8};
        quickSort(a, 0, a.length-1);
        for(int e:a){
            System.out.print(e+" ");
        }
    }
    static void quickSort(int a[], int l, int h){
        if(l < h){
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot-1);  //left part
            quickSort(a, pivot+1, h);  // right part
        }
    }
    static int partition(int a[], int l, int h){
        int pivot = a[l];
        int i = l, j = h;

        while (i <= j){
            while (i <= h && a[i] <= pivot) i++;  //left side
            while (j >= 0 && a[j] > pivot) j--;   //right side
            if(i<j) swap(a,i,j);  //means a ke under i & j ko swap krna
        }
        //now arr ke pivot ko j position se swap kr do so that pivot right pos pe aa jaye
        swap(a,l,j);

        return j;  //pivot ko original pos
    }
    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
