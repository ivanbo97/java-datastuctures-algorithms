package com.ivanboyukliev.sortalgorithms.sortingwithjdk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(array);
        Arrays.parallelSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
