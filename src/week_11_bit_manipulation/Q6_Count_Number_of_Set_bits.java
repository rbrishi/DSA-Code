package week_11_bit_manipulation;

public class Q6_Count_Number_of_Set_bits {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(countSetBits(n));
        System.out.println(countSetBitsOptimised(n));
    }
    static int countSetBits(int n){
        int count = 0;
        while (n != 0){
            if((n&1) != 0){
                count++;
            }n = n >> 1;
        }return count;
    }

    static int countSetBitsOptimised(int n){  //TC is less than log(n)
        int count = 0;
        while (n != 0){
            n = n & (n-1);
                count++;
        }return count;
    }
}
