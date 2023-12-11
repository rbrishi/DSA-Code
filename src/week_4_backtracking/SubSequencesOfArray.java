package week_4_backtracking;

import java.util.ArrayList;

public class SubSequencesOfArray {
    public static void main(String[] args) {
        int[] a = {1,4,4,6};
        ArrayList<ArrayList<Integer>> ans = subSequences(a);
        for(ArrayList<Integer> list : ans)
            System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>> subSequences(int[] a){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helperSubSequence(a, ans, 0, new ArrayList<>());
        return ans;
    }
    static void helperSubSequence(int[] a, ArrayList<ArrayList<Integer>> ans,  int index, ArrayList<Integer> cur){
        ArrayList<Integer> curCopy = new ArrayList<>(cur);

        ans.add(curCopy);

        for (int i = index; i < a.length; i++){
            if(i > index && a[i] == a[i-1]) continue; // to avoid duplicate
            cur.add(a[i]);
            helperSubSequence(a,ans,i+1, cur);
            cur.remove(cur.size()-1); // backtrack
        }
    }
}
