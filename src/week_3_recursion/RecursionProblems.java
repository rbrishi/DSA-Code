package week_3_recursion;

public class RecursionProblems {
    public static void main(String[] args) {
        //System.out.println(fibonacciNumbers(5));
        //System.out.println(nCr(5,6));
        //System.out.println(josephusProblem(5,3));
        //System.out.println(power(2,5));
        //System.out.println(fastPower(2,-2));
        //System.out.println(fastPowerWithModulo(7,7,30));
        System.out.println(matrixPath(2,2));
    }
    static int fibonacciNumbers(int n){
        if(n <= 1) return n;
        return fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
    }

    static int nCr(int n, int r){
        if(n == r || r == 0) return 1;
        if(r > n) return 0;
        return nCr(n-1,r) + nCr(n-1, r-1);
    }

    static int josephusProblem(int n, int k){
        if(n == 1) return 0;
        return (josephusProblem(n-1,k) + k) % n;
    }

    static double power(double a, double b){
        if(b == 0) return 1;
        return a * power(a,b-1);
    }

    static double fastPower(double a, int b){
        if(b == 0) return 1;

        //negative case
        if(b < 0) return fastPower(1/a, Math.abs(b));

        if((b&1)==0) return fastPower(a*a,b/2); //even
        else return a * fastPower(a,b-1);
    }
    static double fastPowerWithModulo(double a, int b, int m){
        if(b == 0) return 1;

        //negative case
        if(b < 0) return fastPowerWithModulo(1/a, Math.abs(b), m);

        if((b&1)==0) return fastPowerWithModulo((a % m * a % m) % m,b/2, m); //even
        else return ((a % m) * fastPowerWithModulo(a,b-1, m) % m) % m;
    }

    static int matrixPath(int n, int m){
        if(n == 1 || m == 1) return 1;
        return matrixPath(n-1,m) + matrixPath(n, m-1);
    }
}
