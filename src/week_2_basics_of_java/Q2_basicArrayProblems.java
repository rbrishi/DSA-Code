package week_2_basics_of_java;

public class Q2_basicArrayProblems {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9,4};
        lastNumberInSortedPosition(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void lastNumberInSortedPosition(int arr[]){
        int n = arr.length;
        int last = arr[n-1];
        int swapIndex = n-2;

        // Check which number is just greater than last number
        // jab nhi pta h ki kitni baar iterate krna h tab while loop use kro
        while (swapIndex >= 0 && arr[swapIndex] > last){
            swapIndex--;
        }
        //Now do right shift
        for(int i = n-1; i >= swapIndex+2; i--){
            arr[i] = arr[i-1];
        }
        arr[swapIndex+1] = last;
    }
}
