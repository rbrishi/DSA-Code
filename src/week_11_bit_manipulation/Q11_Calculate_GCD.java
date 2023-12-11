package week_11_bit_manipulation;

public class Q11_Calculate_GCD {
    public static void main(String[] args) {
        System.out.println(calculateGCD(240,360));
    }
    static int calculateGCD(int a, int b){
        if(b == 0) return a;
        return calculateGCD(b,a%b);
    }
}
