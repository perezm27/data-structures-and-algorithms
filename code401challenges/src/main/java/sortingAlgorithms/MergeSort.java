package sortingAlgorithms;

public class MergeSort {
//  Souce: https://www.baeldung.com/java-merge-sort
    public int[] mergeSort(int[] arr, int lengthOfArr) {
        lengthOfArr = arr.length;
        int mid = lengthOfArr / 2;
        int[] left = new int [mid];
        int[] right = new int[lengthOfArr - mid];

        if (lengthOfArr < 1) {
            return arr;
        }

        if (lengthOfArr > 1) {
            mid = lengthOfArr / 2;
//            left = arr[0..mid];
//            right = arr[mid..lengthOfArr];

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

