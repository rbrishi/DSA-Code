package week_12_binary_searching;

import java.util.Arrays;

public class Q10_Aggressive_Cows {
    public static void main(String[] args) {
        int a[] = {1,2,4,8,9};
        System.out.println(aggressiveCows(a,3));
    }
    static int aggressiveCows(int a[], int k){
        int l = 0, h = (int)1e9;
        int ans = -1;
        Arrays.sort(a);
        while (l <= h){
            int m = l + (h-l)/2;
            if(isPossible(a,k,m)){
                ans = m;
                l = m + 1;
            }else {
                h = m - 1;
            }
        }return ans;
    }
    static boolean isPossible(int a[], int k, int dis){
        int count = 1;
        int prev = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] - prev >= dis){
                count++;
                prev = a[i];
            }
        }return count >= k;
    }
}
