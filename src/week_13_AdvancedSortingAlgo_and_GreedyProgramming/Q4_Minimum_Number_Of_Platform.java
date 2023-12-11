package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

import java.util.Arrays;

public class Q4_Minimum_Number_Of_Platform {
    public static void main(String[] args) {
        int arr[] = {900,940,950,1100,1500,1800};
        int dep[] = {910,1200,1120,1130,1900,2000};
        System.out.println(minPlatform(arr,dep));
    }
    static int minPlatform(int arr[], int dep[]){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int count = 0;
        int maxCount = 0;

        while (i < n){
            if(arr[i] <= dep[j]){
                count++;
                maxCount = Math.max(count, maxCount);
                i++;
            }else {
                count--;
                j++;
            }
        }return maxCount;
    }
}
