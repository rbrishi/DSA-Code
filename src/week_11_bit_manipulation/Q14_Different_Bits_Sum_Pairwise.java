package week_11_bit_manipulation;

public class Q14_Different_Bits_Sum_Pairwise {
    public static void main(String[] args) {
        int a[] = {1,3,5};
        System.out.println(differentBitSumPairwise(a));
    }
    static int differentBitSumPairwise(int a[]){
        int n = a.length;
        int ans = 0;
        for(int i = 0; i < 32; i++){
            int k = 0;
            for(int e : a){
                if((e & (1 << i)) != 0){
                    k++;
                }
            }
            ans += k * (n-k) * 2;
        }return ans;
    }
}
