package week_9_Stack;

import java.util.ArrayDeque;

public class Q4_Infix_To_Postfix {
    public static void main(String[] args) {
        String exp = "( ( a - b ) * d ) - e";
        System.out.println(infixToPostfix(exp));
    }
    static boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")
                || s.equals("^");
    }

    static int precedence(String s){
        switch (s){
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return -1;
        }
    }
    static String infixToPostfix(String s){
        String[] tokens = s.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(); //to avoid multiple strings

        for(String token : tokens){
            if(token.equals("(")){
                stack.push(token);
            }
            else if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >precedence(token)){
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.push(token);
            }
            else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")){
                    String temp = stack.pop();
                    sb.append(temp).append(" ");
                }
                stack.pop();
            }
            else{  //operand
                sb.append(token).append(" ");
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString();
    }
}
