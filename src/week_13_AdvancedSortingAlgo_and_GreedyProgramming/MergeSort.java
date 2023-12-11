package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {4, 3, 11, 10, 2, 1, 5, 7, 9};
        mergeSort(a, 0, a.length - 1);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    static void mergeSort(int a[], int l, int h) {
        if (l < h) {
            int m = (l + h + 1) / 2;
            mergeSort(a, l, m - 1);
            mergeSort(a, m, h);
            merge(a, l, m, h);
        }
    }

    static void merge(int a[], int l, int m, int h) {
        int n1 = m - l;
        int n2 = h - m + 1;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = l; i < m; i++) {
            left[i - l] = a[i];
        }
        for (int i = m; i <= h; i++) {
            right[i - m] = a[i];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}

