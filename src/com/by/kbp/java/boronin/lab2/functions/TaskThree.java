package com.by.kbp.java.boronin.lab2.functions;

public class TaskThree {
    public static boolean runBinarySearchRecursively(
            int[]sortedArray, int key, int low, int high) {
        int middle = (low + high)/2;

        if (key == sortedArray[middle]) {
            return true;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}
