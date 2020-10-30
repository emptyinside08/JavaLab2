package com.by.kbp.java.boronin.lab2.functions;

public class TaskTwo {
    public static void mergeSort(int[]arr, int size) {
        if (size < 2) {
            return;
        }
        int middle = size/2;
        int[]left = new int[middle];
        int[]right = new int[size - middle];

        for (int i = 0; i < middle; i++) {
            left[i]= arr[i];
        }
        for (int i = middle; i < size; i++) {
            right[i - middle]= arr[i];
        }
        mergeSort(left, middle);
        mergeSort(right, size - middle);

        merge(arr, left, right, middle, size - middle);
    }

    public static void merge(int[]arr, int[]lefty, int[]rightly, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (lefty[i]<= rightly[j]) {
                arr[k++]= lefty[i++];
            }
            else {
                arr[k++]= rightly[j++];
            }
        }
        while (i < left) {
            arr[k++]= lefty[i++];
        }
        while (j < right) {
            arr[k++]= rightly[j++];
        }
    }
}
