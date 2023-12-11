package week_4_backtracking;

import java.util.ArrayList;
import java.util.List;

public class SmartKeypadProblem {
    public static void main(String[] args) {
        String input = "23";
        List<String> ans = smartKeypad(input);
        for (String s:ans){
            System.out.println(s);
        }
    }
    static List<String> smartKeypad(String input){
        String a[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        smartKeypadHelper(input,0,ans,a,"");

        return ans;
    }
    static void smartKeypadHelper(String input, int index, List<String> ans, String[] a, String cur){
        if(index == input.length()){
            ans.add(cur);
            return;
        }
        int indexOfButton = input.charAt(index)-'0'; // here fetching char for string and then converting to integer value
        String buttonString = a[indexOfButton];

        for(int i=0; i<buttonString.length(); i++){
//            cur = cur + buttonString.charAt(i);
//            smartKeypadHelper(input,index+1, ans, a, cur);
//            cur = cur.substring(0,cur.length()-1); //backtracking

            //second way
            smartKeypadHelper(input, index+1, ans, a, cur+buttonString.charAt(i));
        }
    }
}
