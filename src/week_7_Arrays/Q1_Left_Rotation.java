package week_7_Arrays;

public class Q1_Left_Rotation {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] = {21,3};
        int ans[][] = multipleRotations(a,b);
        for (int e[]: ans) {
            for(int i:e){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static int[][] multipleRotations(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int ans[][] = new int[m][n];
        int temp[] = new int[2*n];
        for(int i  =0; i < n; i++){
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        for(int i = 0; i < m; i++){
            int offset = (b[i]) % n;
            for(int j = 0; j < n; j++){
                ans[i][j] = temp[j+offset];
            }
        }return ans;
    }

    static void bruteForce(int a[], int k){
        int n = a.length;

        for(int i = 0; i < k; i++){
            int temp = a[0];
            for(int j = 0; j < n-1; j++){
                a[j] = a[j+1];
            }
            a[n-1] = temp;
        }
    }
}
