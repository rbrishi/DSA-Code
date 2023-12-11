package week_4_backtracking;

import java.util.ArrayList;

public class PermutationOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<int []> ans = new ArrayList<>();
        permutation(arr,0, arr.length-1, ans);

        for (int[] a :
                ans) {
            print(a);
        }
    }

    static void permutation(int[] arr, int l, int r, ArrayList<int []> ans){
        if(l == r){
            print(arr);
            int[] b = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                b[i] = arr[i];
            }
            ans.add(b);
            return;
        }
        for (int i = l; i <= r; i++){
             swap(arr,i,l);
             permutation(arr,l+1, r, ans);
             swap(arr,i,l); // Backtracking
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
}
