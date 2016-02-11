package test;

import java.util.Arrays;

public class ArraysLoops {

    //Сортировка пузырьком

    public static void main(String[] args) {
        int[] testArray = {6, 90, 1, 52, 13, 5, 9};

//        boolean swapOccured = true;
//
//        while (swapOccured) {
//            swapOccured = false;
//            for (int i = 0; i < testArray.length - 1; i++) {
//                if (testArray[i] > testArray[i + 1]) {
//                    int tempVar = testArray[i];
//
//                    testArray[i] = testArray[i + 1];
//                    testArray[i + 1] = tempVar;
//
//                    swapOccured = true;
//                }
//            }
//        }

        Arrays.sort(testArray);

        for (int element : testArray) {
            System.out.println(element);
        }

    }
}
