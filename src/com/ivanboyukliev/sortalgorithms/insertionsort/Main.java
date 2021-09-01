package com.ivanboyukliev.sortalgorithms.insertionsort;

// Insertion Sort
public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIdx = 1; firstUnsortedIdx < array.length; firstUnsortedIdx++) {
            int newElement = array[firstUnsortedIdx];

            int i;
            for (i = firstUnsortedIdx; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }
        // Printing result
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
