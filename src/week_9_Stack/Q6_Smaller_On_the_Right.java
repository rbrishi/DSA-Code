package week_9_Stack;

import java.util.ArrayDeque;

public class Q6_Smaller_On_the_Right {
    public static void main(String[] args) {
        int[] a = {1,6,4,10,2,5};
        int[] ans = smallerOnRight(a);
        for(int e:ans){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    static int[] smallerOnRight(int[] a){
        int[] ans = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = a.length-1; i >= 0; i--){
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = a.length;
            }else ans[i] = stack.peek();
            stack.push(i);
        }return ans;
    }
}
