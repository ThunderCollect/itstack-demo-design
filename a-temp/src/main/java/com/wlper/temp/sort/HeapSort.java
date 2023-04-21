package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: HeapSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 堆排序
 * @Author: Thunder
 * @Date: Created in 2023-04-21 08:20
 * @Version: V1.0.0
 */
public class HeapSort {

    // Global variable that records the length of an array;
    static int heapLen;

    /**
     * Swap the two elements of an array
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Build Max Heap
     *
     * @param arr
     */
    private static void buildMaxHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i);
        }
    }

    /**
     * Adjust it to the maximum heap
     *
     * @param arr
     * @param i
     */
    private static void heapify(int[] arr, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (right < heapLen && arr[right] > arr[largest]) {
            largest = right;
        }
        if (left < heapLen && arr[left] > arr[largest]) {
            largest = left;
        }
        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, largest);
        }
    }

    /**
     * Heap Sort
     * <p>
     * 堆排序是指利用堆这种数据结构所设计的一种排序算法。
     * 堆是一个近似完全二叉树的结构，并同时满足堆的性质：即子结点的值总是小于（或者大于）它的父节点。
     * <p>
     * 算法步骤将
     * 1、初始待排序列 (R1, R2, ……, Rn) 构建成大顶堆，此堆为初始的无序区；
     * 2、将堆顶元素 R[1] 与最后一个元素 R[n] 交换，此时得到新的无序区 (R1, R2, ……, Rn-1) 和新的有序区 (Rn), 且满足 R[1, 2, ……, n-1]<=R[n]；
     * 3、由于交换后新的堆顶 R[1] 可能违反堆的性质，因此需要对当前无序区 (R1, R2, ……, Rn-1) 调整为新堆，
     * 然后再次将 R [1] 与无序区最后一个元素交换，得到新的无序区 (R1, R2, ……, Rn-2) 和新的有序区 (Rn-1, Rn)。
     * 不断重复此过程直到有序区的元素个数为 n-1，则整个排序过程完成。
     *
     * @param arr
     * @return
     */
    public static int[] heapSort(int[] arr) {
        // index at the end of the heap
        heapLen = arr.length;
        // build MaxHeap
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            // Move the top of the heap to the tail of the heap in turn
            swap(arr, 0, i);
            heapLen -= 1;
            heapify(arr, 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
