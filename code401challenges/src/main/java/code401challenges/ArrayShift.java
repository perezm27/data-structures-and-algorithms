package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

    }
    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded){
        int[] newArr = new int[arrToBeShifted.length + 1];
        int targetIndex = arrToBeShifted.length / 2;
        int countOfIndex = 0;

        for (int i = 0; i < arrToBeShifted.length; i++) {

            if (i == targetIndex){
                newArr[i] = intToBeAdded;
                countOfIndex++;
            }
            newArr[countOfIndex] = arrToBeShifted[i];
            countOfIndex++;
        }
        System.out.println("End: " + Arrays.toString(newArr));
        return newArr;
    }
}
