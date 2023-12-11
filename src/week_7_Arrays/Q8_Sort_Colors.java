package week_7_Arrays;

public class Q8_Sort_Colors {
    public static void main(String[] args) {
        int a[] = {1,2,0,1,2,0};
        //sortColors(a);
        sortColorsBruteForce(a);
        for (int e:
             a) {
            System.out.print(e + " ");
        }
    }
    static int[] sortColors(int a[]){
        int l=0,m=0;
        int h = a.length-1;

        while (m <= h){
            if(a[m] == 2){
                a[m] = a[h];
                a[h] = 2;
                h--;
            } else if (a[m] == 0) {
                a[m] = a[l];
                a[l] = 0;
                l++;
                m++;
            }else {
                m++;
            }
        }
        return a;
    }

    // bruteForce
    static int[] sortColorsBruteForce(int a[]){
        int zeroCount = 0;
        int oneCont = 0;
        int twoCont = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0)
                zeroCount++;
            if (a[i] == 1) {
                oneCont++;
            }if(a[i] == 2) twoCont++;
        }
        int i = 0;
        while (zeroCount > 0){
            a[i] = 0;
            i++;
            zeroCount--;
        }
        while (oneCont > 0){
            a[i] = 1;
            i++;
            oneCont--;
        }
        while (twoCont > 0){
            a[i] = 2;
            i++;
            twoCont--;
        }
        return a;
   }

}

