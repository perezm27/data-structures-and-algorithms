package sortingAlgorithms;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        int n = arr.length;
        int mid;
        int[] left = new int [n/2];
        int[] right;

        if (n < 1) {
            return arr;
        }

        if (n > 1) {
            mid = n / 2;
//            left = arr[0..mid];
//            right = arr[mid..n];

            mergeSort(left);
//            mergeSort(right);
//            merge(left, right, arr);

        }
        return arr;
    }

    public int[] merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == left.length) {
//    set remaining entries in arr to remaining values in right
        } else {
//    set remaining entries in arr to remaining values in left
        }
        return arr;
    }
}

