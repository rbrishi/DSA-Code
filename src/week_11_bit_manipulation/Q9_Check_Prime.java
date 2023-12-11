package week_11_bit_manipulation;

public class Q9_Check_Prime {
    public static void main(String[] args) {
        System.out.println(checkPrime(13));
    }
    static boolean checkPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if((n % i) == 0) return false;
        }
        return true;
    }
}
