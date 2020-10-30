package com.by.kbp.java.boronin.lab2.functions;

public class TaskOne {
    public static void quickSort(int[] array, int low, int high) {

        int middle = low + (high - low) / 2;
        int base = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
