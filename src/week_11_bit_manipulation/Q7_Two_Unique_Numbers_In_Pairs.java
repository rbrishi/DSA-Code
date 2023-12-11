package week_11_bit_manipulation;

public class Q7_Two_Unique_Numbers_In_Pairs {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,1,2,6};
        int ans[] = twoUniqueNumbers(a);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] twoUniqueNumbers(int[] a){
        int xor = 0;
        for(int e : a){
            xor ^= e;
        }
        int mask = (xor & (-xor));
        int firstNumber = 0;
        for(int e : a){
            if((mask & e)==0){
                firstNumber ^= e;
            }
        }
        int secondNumber = xor ^ firstNumber;
        int[] ans = new int[2];
        ans[0] = firstNumber;
        ans[1] = secondNumber;
        return ans;
    }
}
