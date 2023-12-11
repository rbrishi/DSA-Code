package week_4_backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumProblem {
    public static void main(String[] args) {
        int a[] = {8,1,3,7,2,1,5};
        Arrays.sort(a);
        int sum = 12;
        ArrayList<ArrayList<Integer>> ans = combinationSum(a,sum);
        for (ArrayList<Integer> list : ans){
            System.out.println(list);
        }
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] a, int sum){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helperCombinationSum(a, ans, 0, sum, new ArrayList<>());
        return ans;
    }

    private static void helperCombinationSum(int[] a, ArrayList<ArrayList<Integer>> ans, int index, int sum, ArrayList<Integer> cur) {
        if(sum == 0){
            //cur ki copy bnake ans me dal do
            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);
            return;
        }
        for (int i = index; i < a.length; i++){
            if(a[i] > sum) return;

            if(i > index && a[i] == a[i-1]) continue; // to avoid duplicate
            cur.add(a[i]);
            helperCombinationSum(a,ans, i+1,sum-a[i], cur);
            //backtracking
            cur.remove(cur.size()-1);
        }
    }
}
