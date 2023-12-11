package week_11_bit_manipulation;

public class Q8_XOR_Queries {
    public static void main(String[] args) {
        int a[] = {1,3,4,8};
        System.out.println(xorQueries(a,0,3));
    }
    static int xorQueries(int a[], int l, int r){
        int xor[] = new int[a.length];
        xor[0] = a[0];
        for(int i = 1; i < a.length; i++){
            xor[i] = xor[i-1] ^ a[i];
        }
        int left = l == 0 ? 0 : xor[l-1];
        int right = xor[r];
        return left ^ right;
    }
}
