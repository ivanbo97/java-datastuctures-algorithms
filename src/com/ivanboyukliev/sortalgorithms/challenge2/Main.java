package com.ivanboyukliev.sortalgorithms.challenge2;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(array,array.length);
        // Printing result
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

  /*  public static void insertionSort(int[] arr, int idx, int elementForCheck) {
        if ((idx > 0 && idx < 7) && arr[idx - 1] > elementForCheck) {
            arr[idx] = arr[idx - 1];
            insertionSort(arr, ++idx, elementForCheck);
        }
        arr[idx] = elementForCheck;
    }*/

    public static void insertionSort(int[] arr, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSort(arr, numItems - 1);
        int newElement = arr[numItems - 1];
        int i;
        for(i = numItems-1; i>0 && arr[i-1]>newElement;i--){
            arr[i] = arr[i-1];
        }
        arr[i] = newElement;
    }
}
