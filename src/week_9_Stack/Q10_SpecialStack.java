package week_9_Stack;

import java.util.ArrayDeque;

public class Q10_SpecialStack {
    ArrayDeque<Integer> stack;
    int min;
    public Q10_SpecialStack(){
        stack = new ArrayDeque<>();
    }

    public void push(int x){
        if(stack.isEmpty()){
            min = x;
            stack.push(x);
            return;
        }
        if(x < min){
            stack.push(2*x-min);
            min = x;
        }else {
            stack.push(x);
        }
    }
    public int pop(){
        if(stack.isEmpty()) return -1;
        int y = stack.pop();
        if(y < min){
            int newMin = 2 * min - y;
            int temp = min;
            min = newMin;
            return temp;
        }else return y;
    }
    public int getMin(){
        if(stack.isEmpty()) return -1;
        return min;
    }
}
