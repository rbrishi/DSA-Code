package week_7_Arrays;

public class Q6_Minimum_Sum_SubArray {
    public static void main(String[] args) {
        int a[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSumSubArray(a,target));
        //System.out.println(minimumSumSubArrayWithIndex(a,target));
    }
    static int minimumSumSubArray(int a[], int target){
        int l = 0, r = 0;
        int curSum = 0;
        int minLength = Integer.MAX_VALUE;
        int n = a.length;

        while (r < n){
            curSum += a[r];

            while(curSum >= target){
                minLength = Math.min(minLength, r-l+1);
                curSum -= a[l];
                l++;
            }
            r++;
        }

        if(minLength == Integer.MAX_VALUE){
            minLength = 0;
        }
        return minLength;
    }

    // if in ques index is asking then
    static int minimumSumSubArrayWithIndex(int a[], int target){
        int l = 0, r = 0;
        int x= -1,y = -1;
        int curSum = 0;
        int minLength = Integer.MAX_VALUE;
        int n = a.length;

        while (r < n){
            curSum += a[r];

            while(curSum >= target){
                if(r-l+1 < minLength){
                    minLength = r-l+1;
                    x = l; y = r;
                }
                curSum -= a[l];
                l++;
            }
            r++;
        }
        if(minLength == Integer.MAX_VALUE){
            minLength = 0;
        }
        System.out.println(x +" "+ y);
        return minLength;
    }
}
