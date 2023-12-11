package week_12_binary_searching;

public class Q9_Tree_Cutter_Problem {
    public static void main(String[] args) {
        int a[] = {1,7,6,3,4,7};
        System.out.println(woodCutter(a,8));
    }
    static int woodCutter(int a[], int k){
        int l = 0, h = (int)1e9;  //1e9 => 10^9
        int ans = -1;
        while (l <= h){
            int m = l + (h-l)/2;
            int totalWoodLength = getWoodCut(a,m);
            if(totalWoodLength == k)  return m;
            if(totalWoodLength > k){
                ans = m;
                l = m +1;
            }else {
                h = m - 1;
            }
        }return ans;
    }
    static int getWoodCut(int a[],int cut){ //cut = H
        int ans = 0;
        for(int e : a){
            ans += e > cut ? e - cut : 0;
        }return ans;
    }
}
