package week_12_binary_searching;

public class Q11_Median_of_the_Row_Wise_Sorted_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,6},{3,4,9},{3,6,18}};
        System.out.println(medianInMatrix(matrix));
    }
    static int medianInMatrix(int a[][]){
        int rows = a.length, col = a[0].length;
        int n = (rows*col);
        int desired = n/2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++){
            min = Math.min(a[i][0], min);
            max = Math.max(a[i][col-1], max);
        }
        int l = min, h = max;
        int ans = -1;
        while (l < h){
            int m = l+(h-l)/2;
            int count = 0;
            for(int i = 0; i < rows; i++){
                count += upperBoundInAnArray(a[i], m);
            }
            if(count <= desired){
                l = m+1;
            }else {
                ans = m;
                h = m;
            }
        }
        return ans;
    }
    static int upperBoundInAnArray(int a[], int k){
        int l = 0, h = a.length-1;
        int ans = a.length;
        while (l <= h){
            int m = l+(h-l)/2;
            if(a[m] > k){
                ans = m;
                h = m-1;
            }else if(a[m] <= k){
                l = m+1;
            }
        }return ans;
    }
}
