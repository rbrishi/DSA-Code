package week_11_bit_manipulation;

public class Q4_Clear_Bits_In_Given_Range {
    public static void main(String[] args) {
        System.out.println(clearBitsInGivenRange(3,1,2));
    }
    //0 <= i < j < 31
    static int clearBitsInGivenRange(int n, int i, int j){
        int a = (~0 << (j+1));
        int b = ((1 << i) - 1);
        int mask = a | b; 
        return n & mask;
    }
}
