package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: ShellSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 希尔排序
 * @Author: Thunder
 * @Date: Created in 2023-04-20 17:17
 * @Version: V1.0.0
 */
public class ShellSort {

    /**
     * 希尔排序
     * <p>
     * 希尔排序是希尔 (Donald Shell) 于 1959 年提出的一种排序算法。希尔排序也是一种插入排序，
     * 它是简单插入排序经过改进之后的一个更高效的版本，也称为递减增量排序算法，
     * 同时该算法是冲破 O(n²) 的第一批算法之一。
     * 希尔排序的基本思想是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
     * 待整个序列中的记录 “基本有序” 时，再对全体记录进行依次直接插入排序。
     * <p>
     * 算法步骤
     * 我们来看下希尔排序的基本步骤，在此我们选择增量 gap=length/2，缩小增量继续以 gap = gap/2 的方式，
     * 这种增量选择我们可以用一个序列来表示，{n/2, (n/2)/2, ..., 1}，称为增量序列。
     * 希尔排序的增量序列的选择与证明是个数学难题，我们选择的这个增量序列是比较常用的，也是希尔建议的增量，称为希尔增量，
     * 但其实这个增量序列不是最优的。此处我们做示例使用希尔增量。
     * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
     * 选择一个增量序列 {t1, t2, …, tk}，其中 (ti>tj, i<j, tk=1)；
     * 按增量序列个数 k，对序列进行 k 趟排序；
     * 每趟排序，根据对应的增量 t，将待排序列分割成若干长度为 m 的子序列，分别对各子表进行直接插入排序。
     * 仅增量因子为 1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     *
     * @param arr
     * @return arr
     */
    public static int[] shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int current = arr[i];
                int preIndex = i - gap;
                // Insertion sort
                while (preIndex >= 0 && arr[preIndex] > current) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;

            }
            gap /= 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 7, 22, 50};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
