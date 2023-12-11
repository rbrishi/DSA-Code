package week_7_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3_Minimum_Difference {
    public static void main(String[] args) {
        int a[] = {12,9,8,2,11,3,4,7,2};
        List<List<Integer>> ans = minimumDifference(a);
        System.out.println(ans);
    }

    static List<List<Integer>> minimumDifference(int a[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i< a.length; i++){
//            if(a[i]-a[i-1] < minDiff){
//                minDiff = a[i]-a[i-1];
//            }
            //or
            minDiff = Math.min(minDiff,a[i]-a[i-1]);
        }
        for(int i = 1; i< a.length; i++){
            if(a[i]-a[i-1] == minDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
