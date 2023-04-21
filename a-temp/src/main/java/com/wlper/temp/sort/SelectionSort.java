package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: SelectionSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 选择排序
 * @Author: Thunder
 * @Date: Created in 2023-04-20 16:42
 * @Version: V1.0.0
 */
public class SelectionSort {

    /**
     * 选择排序
     * 选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。
     * 所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
     * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
     * <p>
     * 算法步骤
     * 1、首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * 2、再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 3、重复第 2 步，直到所有元素均排序完毕。
     *
     * @param arr
     * @return arr
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
