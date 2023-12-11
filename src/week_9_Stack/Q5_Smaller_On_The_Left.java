package week_9_Stack;

import java.util.ArrayDeque;

public class Q5_Smaller_On_The_Left {
    public static void main(String[] args) {
        int[] a = {1,6,4,10,2,5};
        int[] ans = smallerOnLeft(a);
        for(int e:ans){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    static int[] smallerOnLeft(int[] a){
        int[] ans = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < a.length; i++){
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else ans[i] = stack.peek();
            stack.push(i);
        }return ans;
    }
}
