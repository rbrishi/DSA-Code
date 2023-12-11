package week_7_Arrays;

import java.util.Arrays;

public class Q7_Make_All_Element_Of_Matrix_Equal {
    public static void main(String[] args) {
//        int a[][] = {{3,63,42},
//                     {18,12,12},
//                     {15,21,18},
//                     {33,84,24}};
        int a[][] = {{4,6,8,10,1000}};
        System.out.println(makeMatrixEqual(a,2));

    }
    static int makeMatrixEqual(int a[][], int k){
        int n = a.length;
        int m = a[0].length;
        if(n==0) return 0;

        int b[] = new int[n*m];

        //store matrix element into array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[i*m+j] = a[i][j]; //here formula applied
            }
        }
        Arrays.sort(b);
        int median = b[(n*m)/2];
        return helper(b,median,k);

//        for(int i=0; i<n*m; i++){
//            System.out.println(i+" "+ b[i] + " "+ helper(b,b[i],k));
//        }
//        return 0;
    }
    static int helper(int b[], int m, int k){ //m -> jis no ke equal krna h
        int count = 0;
        for(int i = 0; i < b.length; i++){
            if(b[i]%k != 0) return -1;
            count += Math.abs(b[i]-m)/k;
        }
        return count;
    }
}
