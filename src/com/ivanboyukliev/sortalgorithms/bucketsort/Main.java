package com.ivanboyukliev.sortalgorithms.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bucketSort(int[] array) {
        // each bucket will be array list
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // scatter the values

        for (int i = 0; i < array.length; i++) {
            buckets[hash(array[i])].add(array[i]);
        }

        // sorting each bucket
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // gather all the values in original array
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                array[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
