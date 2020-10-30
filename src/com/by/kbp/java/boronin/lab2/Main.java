package com.by.kbp.java.boronin.lab2;

import com.by.kbp.java.boronin.lab2.functions.TaskOne;
import com.by.kbp.java.boronin.lab2.functions.TaskTwo;
import com.by.kbp.java.boronin.lab2.functions.TaskThree;

import java.util.Arrays;

import static com.by.kbp.java.boronin.lab2.functions.TaskThree.runBinarySearchRecursively;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array");
        int[] arr = {3, 5, 2, 6, 2, 7, 8};
        System.out.println(Arrays.toString(arr));

        System.out.println("Quick sort");
        TaskOne quick = new TaskOne();
        quick.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        System.out.println("Merge sort");
        TaskTwo merge = new TaskTwo();
        merge.mergeSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));

        System.out.println("Binary search");
        System.out.println(runBinarySearchRecursively(arr, 2, 0,arr.length-1));
    }
}
