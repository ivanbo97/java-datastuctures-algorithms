package com.ivanboyukliev.sortalgorithms.searchalgorithms.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(iterativeBinarySearch(array, 7));
    }

    public static int iterativeBinarySearch(int[] array, int searchedVal) {
        int start = 0;
        int end = array.length;

        int midPoint = 0;

        while (start < end) {
            midPoint = (start + end) / 2;
            if (array[midPoint] == searchedVal) {
                return midPoint;
            }
            if (searchedVal > array[midPoint]) {
                start = midPoint + 1;
                continue;
            }
            end = midPoint;
        }
        return -1;
    }
}
