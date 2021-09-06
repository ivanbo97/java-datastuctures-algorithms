package com.ivanboyukliev.sortalgorithms.searchalgorithms.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, 22};
        System.out.println(linearSearch(array, -15));
        System.out.println(linearSearch(array, 11));
    }

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
