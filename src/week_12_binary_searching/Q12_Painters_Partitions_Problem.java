package week_12_binary_searching;

import java.util.Arrays;

public class Q12_Painters_Partitions_Problem {
    public static void main(String[] args) {
        int a[] = {10,10,10,10};
        System.out.println(paintersPartitioning(a,2));
    }
    static int paintersPartitioning(int a[], int k){
        int l = -1;
        for(int e:a) l = Math.max(e,l);
        int h = 0;
        for(int e:a) h += e;
        int ans = 0;
        while (l <= h){
            int m = l+(h-l)/2;
            int paintersCount = countPainters(a, m);
            if(paintersCount > k) {
                l = m+1;
            } else {
                h = m-1;
                ans = m;
            }
        }return ans;
    }
    static int countPainters(int a[], int time){
        int count = 1, sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum > time){
                count++;
                sum = a[i];
            }
        }return count;
    }
}
