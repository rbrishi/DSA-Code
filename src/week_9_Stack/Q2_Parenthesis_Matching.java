package week_9_Stack;

import java.util.ArrayDeque;

public class Q2_Parenthesis_Matching {
    public static void main(String[] args) {
        System.out.println(matchParenthesis("))[{}]"));
    }
    static boolean matchParenthesis(String s){
        int n = s.length();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            char curChar = s.charAt(i);
            if(curChar == '{' || curChar == '[' || curChar == '('){
                stack.push(curChar);
            }else{
                if(stack.isEmpty()) return false;
                char opening = stack.poll();
                if((opening == '[' && curChar == ']') || (opening == '{' && curChar == '}')
                        || (opening == '(' && curChar == ')')) continue;
                else return false;
            }
        }return stack.isEmpty();
    }
}
