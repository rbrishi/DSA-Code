package week_7_Arrays;
import java.util.*;

public class Q2_WaveArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5,3};
        waveArrayLexicographic(a);
        //waveArray(a);
        for(int e:a){
            System.out.print(e+" ");
        }
    }

    static void waveArrayLexicographic(int a[]){
        Arrays.sort(a);  //O(nLog(n))
        int n = a.length;
        for(int i=1; i<n; i+=2){
            swap(a,i,i-1);
        }
    }

    static void waveArray(int a[]){
        int n = a.length;
        for(int i=1; i<n; i+=2){
            if(a[i] > a[i-1]){
                swap(a,i,i-1);
            }
            if(i < n-1 && a[i] > a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
