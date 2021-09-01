package com.ivanboyukliev.sortalgorithms.challenge1;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};


        mergeSort(array,0,array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        // One element array condition
        if (end - start < 2) {
            return;
        }
        // Logical partition the array that was passed
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        // Optimization : Stops the merging of left and right array because their elements
        // are already in correct place
        if (input[mid - 1] >= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        // keeps track of where we are in temp array
        int tmpIdx = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tmpIdx++] = input[i] >= input[j] ? input[i++] : input[j++];
            //compare element in the left partition to element in the right partition
        }
        //Handling elements in the array we haven't traversed.
        System.arraycopy(input, i, input, start + tmpIdx, mid - i);
        System.arraycopy(temp,0,input,start,tmpIdx);
    }
}
