package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[] { 1, 2, 3, 4, 5, 6 };

    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }

  public static int[] reverseArray(int[] arr) {
    int[] outputArr = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      outputArr[arr.length - 1 - i] = arr[i];

    }
    return outputArr;
  }
}