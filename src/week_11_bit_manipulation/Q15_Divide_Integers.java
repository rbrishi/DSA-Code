package week_11_bit_manipulation;

public class Q15_Divide_Integers {
    public static void main(String[] args) {
        int dividend = -100;
        int divisor = -6;
        System.out.println(divideIntegers(dividend, divisor));
    }
    static int divideIntegers(int dividend, int divisor){
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        int ans = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend > divisor){
            int temp = divisor;
            int i = 0;
            while(dividend > (temp << 1)) {
                temp = temp << 1;
                i++;
            }
            ans += (1 << i);
            dividend = dividend- temp;
        }return ans * sign;
    }
}
