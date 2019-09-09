
import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        if(arr.length > 0){
            for (int i = 1; i < arr.length ; i++) {
                int previousEl = i - 1;
                int temp = arr[i];

                while (previousEl >= 0 && temp < arr[previousEl]){
                    arr[previousEl + 1] = arr[previousEl];
                    previousEl = previousEl - 1;
                }

                arr[previousEl + 1] = temp;
            }
        }
        return arr;
    }

    public String toString(int[] arr){
        return Arrays.toString(arr);
    }
}
