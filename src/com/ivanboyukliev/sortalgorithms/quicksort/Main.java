package com.ivanboyukliev.sortalgorithms.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};


        quickSort(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] input, int startIdx, int endIdx) {
        if (endIdx - startIdx < 2) {
            //One element array
            return;
        }
        int pivotIdx = partition(input, startIdx, endIdx);
        quickSort(input, startIdx, pivotIdx);
        quickSort(input, pivotIdx + 1, endIdx);
    }

    public static int partition(int[] input, int startIdx, int endIdx) {
        int pivot = input[startIdx];
        int i = startIdx;
        int j = endIdx;

        while (i < j) {
            // Looking for elements that are less than the pivot
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }
            //Looking for the first element that is greater than the pivot
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
