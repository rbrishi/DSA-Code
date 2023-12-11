package week_11_bit_manipulation;

public class Q13_Unique_Number_Of_Triplet {
    public static void main(String[] args) {
        //int a[] = {3,3,7,2,9,9,2,9,2,3};
        int a[] = {12,1,12,3,12,1,1,2,3,3};
        System.out.println(uniqueII(a));
    }
    static int uniqueII(int a[]){
        int ans = 0;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int e : a){
                if((e & (1 << i)) != 0){
                    count++;
                }
            }
            if(count % 3 != 0){
                ans = ans | 1<<i;
            }
        }return ans;
    }
}
