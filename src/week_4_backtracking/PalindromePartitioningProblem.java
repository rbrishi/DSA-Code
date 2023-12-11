package week_4_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningProblem {
    public static void main(String[] args) {
        String s = "abbaca";
        List<List<String>> ans = palindromePartitioning(s);
        for(List<String> i: ans){
            for(String list:i){
                System.out.print(list+" ");
            }
            System.out.println();
        }
    }
    static List<List<String>> palindromePartitioning(String s){
        List<List<String>> ans = new ArrayList<>();
        helper(s,ans,0,new ArrayList<>());

        return ans;
    }

    static boolean isPalindrome(String s, int l, int r){
        while (l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }return true;
    }
    static void helper(String s, List<List<String>> ans, int index, List<String> cur){
        if(index == s.length()){
            List<String> copyCur = new ArrayList<>(cur);
            ans.add(copyCur);
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s,index,i)){
                cur.add(s.substring(index, i+1)); // i+1 bcz last char is excluded in substring method
                helper(s,ans, i+1, cur);
                cur.remove(cur.size()-1);
            }
        }
    }
}
