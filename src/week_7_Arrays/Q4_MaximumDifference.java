package week_7_Arrays;

public class Q4_MaximumDifference {
    public static void main(String[] args) {
        int a[] = {12,9,8,2,11,5,4,5};
        System.out.println(maxDiff(a));
    }
    static int maxDiff(int a[]){
        int n = a.length;

        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            minaipi = Math.min(a[i] + i,minaipi);
            maxaipi = Math.max(a[i] + i,maxaipi);
            minaimi = Math.min(a[i] - i,minaimi);
            maxaimi = Math.max(a[i] - i,maxaimi);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaimi,diffaipi);
    }
}
