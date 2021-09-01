package com.ivanboyukliev.sortalgorithms.radixsort;

public class RadixSort {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray,10,4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(int[] radixArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(radixArray, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[numItems];
        for (int tempIdx = numItems - 1; tempIdx >= 0; tempIdx--) {
            temp[--countArray[getDigit(position, input[tempIdx], radix)]] = input[tempIdx];
        }
        // Copy the temporary array back into the input array
        for(int tempIndex = 0;tempIndex<numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
