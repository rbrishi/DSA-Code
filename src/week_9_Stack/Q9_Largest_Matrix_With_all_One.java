package week_9_Stack;

import java.util.ArrayDeque;

public class Q9_Largest_Matrix_With_all_One {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
                };
        System.out.println(largestMatrixWithAllOne(matrix));
    }
    static int largestMatrixWithAllOne(int[][] a){
        int maxArea = 0;
        int row = a.length, col = a[0].length;
        if(row == 0) return 0;
        int histogram[] = new int[col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(a[i][j] == 0){
                    histogram[j] = 0;
                }else histogram[j]++;
            }
            int curArea = largestAreaInRectangle(histogram);
            maxArea = Math.max(curArea, maxArea);
        }return maxArea;
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
