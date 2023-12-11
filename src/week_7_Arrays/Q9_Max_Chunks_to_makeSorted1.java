package week_7_Arrays;

public class Q9_Max_Chunks_to_makeSorted1 {
    public static void main(String[] args) {
        int[] a = {0,1,2,4,3};
        System.out.println(maxChunks(a));
    }
    static int maxChunks(int[] a){
        if(a.length == 0) return 0;
        int chunks = 0;
        int maxSoFar = a[0];

        for(int i = 0; i < a.length; i++){
            maxSoFar = Math.max(a[i],maxSoFar);
            if(i == maxSoFar)
                chunks++;
        }
        return chunks;
    }
}
