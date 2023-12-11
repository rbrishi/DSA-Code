package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

import java.util.Arrays;

public class Q5_Distribute_Candies {
    public static void main(String[] args) {
        int a[] = {3,1,4,2,1,3};
        System.out.println(distributeCandies(a));
    }
    static int distributeCandies(int a[]){
        int n = a.length;
        int candy[] = new int[n];
        Arrays.fill(candy,1); //means candy arr me 1 fill kr do

        for(int i = 1; i < n; i++){ // L -> R
            if(a[i] > a[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        for (int i = n-2; i >= 0; i--){ // R -> L
            if(a[i] > a[i+1] && candy[i] <= candy[i+1]){
                candy[i] = candy[i+1] + 1;
            }
        }
        int sum = 0;
        for(int e: candy){
            sum += e;
        }return sum;
    }
}
