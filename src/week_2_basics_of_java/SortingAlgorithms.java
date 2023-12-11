package week_2_basics_of_java;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {4,1,8,11,5,2,3,7};

        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        for (int i :
                arr) {
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            boolean sorted = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j+1] < arr[j]){
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;
                     sorted = true;
                }
            }
            if(!sorted) break;
        }
    }

    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            int min = i; //assuming i is minimum index
            for(int j = i+1; j < n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int last = arr[i];
            int swapIndex = i-1;
            while(swapIndex >= 0 && arr[swapIndex] > last){
                swapIndex--;
            }
            int j = i;
            while (j > swapIndex + 1){
                arr[j] = arr[j-1];
                j--;
            }
            arr[swapIndex+1] =  last;
        }
    }
}
