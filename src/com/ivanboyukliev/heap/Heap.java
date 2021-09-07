package com.ivanboyukliev.heap;

public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int val) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = val;
        fixHeapAbove(size);
        size++;
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty!");
        }
        int parentOfTheDeltedItemIdx = getParent(index);
        int deletedVal = heap[index];

        // The rightmost value will replace whatever was at delete node idx
        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parentOfTheDeltedItemIdx]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        size--;
        return deletedVal;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    private void fixHeapAbove(int index) {
        // The value that has been inserted.
        int newVal = heap[index];
        while (index > 0 && newVal > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newVal;
    }

    private void fixHeapBelow(int deletedItemIdx, int lastHeapIdx) {
        int childToSwap;

        while (deletedItemIdx <= lastHeapIdx) {
            int leftChild = getChildIdx(deletedItemIdx, true);
            int rightChild = getChildIdx(deletedItemIdx, false);
            if (leftChild <= lastHeapIdx) {
                if (rightChild > lastHeapIdx) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }
                if (heap[deletedItemIdx] < heap[childToSwap]) {
                    int tmp = heap[deletedItemIdx];
                    heap[deletedItemIdx] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                deletedItemIdx = childToSwap;
            } else {
                break;
            }


        }
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int childIdx) {
        return (childIdx - 1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChildIdx(int parentIdx, boolean left) {
        return 2 * parentIdx + (left ? 1 : 2);
    }
}
