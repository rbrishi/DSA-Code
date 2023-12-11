package week_9_Stack;

import java.util.ArrayDeque;

public class Q3_Evaluate_Postfix {
    public static void main(String[] args) {
        String expression = "3 4 * 2 5 * +";  // space means diff number
        System.out.println(evaluatePostfix(expression));
    }
    static boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")
                || s.equals("^");
    }
    static int evaluatePostfix(String s){
        String[] tokens = s.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(isOperator(token)){
                int second = stack.pop();
                int first = stack.pop();
                int result = 0;
                switch (token){
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "^":
                        result = (int) Math.pow(first, second); // convert to int
                        break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token)); // convert to int for string
            }
        }
        return stack.pop();
    }
}
