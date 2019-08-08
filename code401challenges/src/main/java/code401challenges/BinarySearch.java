package code401challenges;

public class BinarySearch {

    public static int binarySearch (int[] sortedArr, int key){
        int min = 0;
        int max = sortedArr.length - 1;
        int mid = (min + max)/ 2;


        while(min <= max){
            if (key == sortedArr[mid]){
                return mid;
            } else if (key < sortedArr[mid]){
                max = mid -1;
            } else  if (key > sortedArr[mid]){
                min = mid + 1;
            }
            return -1;
        }
        return -1;
    }

}
