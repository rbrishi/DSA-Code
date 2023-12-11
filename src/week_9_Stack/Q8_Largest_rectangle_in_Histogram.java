package week_9_Stack;

import java.util.ArrayDeque;

public class Q8_Largest_rectangle_in_Histogram {
    public static void main(String[] args) {
        int[] a = {2,1,5,6,2,3};
        System.out.println(largestAreaInRectangle(a));
    }
    static int largestAreaInRectangle(int[] a){
        int n = a.length;
        int[] prev = smallerOnLeft(a);
        int[] next = smallerOnRight(a);
        int maxArea = 0;

        for(int i = 0; i < n; i++){
            int currArea = (next[i] - prev[i] - 1) * a[i];
            maxArea = Math.max(maxArea , currArea);
        }
        return maxArea;
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
