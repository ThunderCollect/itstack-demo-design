package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: MergeSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 归并排序
 * @Author: Thunder
 * @Date: Created in 2023-04-20 20:25
 * @Version: V1.0.0
 */
public class MergeSort {

    /**
     * 归并排序
     * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法 (Divide and Conquer) 的一个非常典型的应用。
     * 归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；
     * 即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为 2 - 路归并。
     * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是 O(nlogn) 的时间复杂度。
     * 代价是需要额外的内存空间。
     * 算法步骤
     * 归并排序算法是一个递归过程，边界条件为当输入序列仅有一个元素时，直接返回，具体过程如下：
     * 1、如果输入内只有一个元素，则直接返回，否则将长度为 n 的输入序列分成两个长度为 n/2 的子序列；
     * 2、分别对这两个子序列进行归并排序，使子序列变为有序状态；
     * 3、设定两个指针，分别指向两个已经排序子序列的起始位置；
     * 4、比较两个指针所指向的元素，选择相对小的元素放入到合并空间（用于存放排序结果），并移动指针到下一位置；
     * 5、重复步骤 3 ~4 直到某一指针达到序列尾；
     * 6、将另一序列剩下的所有元素直接复制到合并序列尾。
     *
     * @param arr
     * @return arr
     */
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] arr_1 = Arrays.copyOfRange(arr, 0, middle);
        int[] arr_2 = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(mergeSort(arr_1), mergeSort(arr_2));
    }

    /**
     * Merge two sorted arrays
     *
     * @param arr_1
     * @param arr_2
     * @return sorted_arr
     */
    public static int[] merge(int[] arr_1, int[] arr_2) {
        int[] sorted_arr = new int[arr_1.length + arr_2.length];
        int idx = 0, idx_1 = 0, idx_2 = 0;
        while (idx_1 < arr_1.length && idx_2 < arr_2.length) {
            if (arr_1[idx_1] < arr_2[idx_2]) {
                sorted_arr[idx] = arr_1[idx_1];
                idx_1 += 1;
            } else {
                sorted_arr[idx] = arr_2[idx_2];
                idx_2 += 1;
            }
            idx += 1;
        }
        if (idx_1 < arr_1.length) {
            while (idx_1 < arr_1.length) {
                sorted_arr[idx] = arr_1[idx_1];
                idx_1 += 1;
                idx += 1;
            }
        } else {
            while (idx_2 < arr_2.length) {
                sorted_arr[idx] = arr_2[idx_2];
                idx_2 += 1;
                idx += 1;
            }
        }
        return sorted_arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
