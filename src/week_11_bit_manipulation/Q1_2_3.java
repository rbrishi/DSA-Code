package week_11_bit_manipulation;

public class Q1_2_3 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(getIthBit(n,2));
        System.out.println(setIthBit(9,1));
        System.out.println(clearIthBit(13,2));
    }
    static int getIthBit(int n, int i){
        int mask = 1 << i;
//        int result = (n & mask);
//        if(result == 0) return 0;
//        else return 1;
        return (n & mask) == 0 ? 0 : 1;
    }

    static int setIthBit(int n, int i){
        int mask = 1 << i;
        return (n | mask);
    }

    static int clearIthBit(int n, int i){
        int mask = ~(1 << i);
        return (n & mask);
    }
}
