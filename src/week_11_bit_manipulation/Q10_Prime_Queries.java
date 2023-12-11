package week_11_bit_manipulation;

import java.util.Arrays;

public class Q10_Prime_Queries {
    public static void main(String[] args) {
        int n = 100;
        boolean isPrime[] = sieveOfEratosthenes(n);
        for(int i = 0; i <= n; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }

    static int[] primeQueries(int q[][]){
        int n = q.length;
        int length = 0;
        //find maximum query range
        for(int i = 0; i < n; i++){
             length = Math.max(length,q[i][1]);
        }
        boolean isPrime[] = sieveOfEratosthenes(length);
        int count[] = new int[length+1];

        for(int i = 1; i <= length; i++){
            if(isPrime[i]) count[i] = count[i-1] + 1;
            else count[i] = count[i-1];
        }
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int leftCount = count[q[i][0] -1];
            int rightCount = count[q[i][1]];
            ans[i] = rightCount - leftCount;
        }
        return ans;
    }
    static boolean[] sieveOfEratosthenes(int n){
         boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i*i <= n; i++){  // O(n * log log n)
            for(int j = i*i; j <= n; j += i){  //multiple of i
                isPrime[j] = false;
            }
        }return isPrime;
    }
}
