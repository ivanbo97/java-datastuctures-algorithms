package com.ivanboyukliev.sortalgorithms.selectionsort;

public class Main {

    // Theory - On each traversal of the array it selects the largest value
    // int the unsorted partition and it adds it into the sorted partition
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Selection sort
        for (int lastUnsortedIdx = array.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            int largestElementIdx = 0;
            for (int i = 1; i <= lastUnsortedIdx; i++) {
                if (array[i] > array[largestElementIdx]) {
                    largestElementIdx = i;
                }
                swap(array, largestElementIdx, lastUnsortedIdx);
            }
        }

        // Printing result
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        // swap without temp variable
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
