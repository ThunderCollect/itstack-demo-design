package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: QuickSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 快速排序
 * @Author: Thunder
 * @Date: Created in 2023-04-20 20:29
 * @Version: V1.0.0
 */
public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[pointer];
                array[pointer] = temp;
                pointer++;
            }
            System.out.println(Arrays.toString(array));
        }
        int temp = array[pointer];
        array[pointer] = array[high];
        array[high] = temp;
        return pointer;
    }

    /**
     * 快速排序
     * 快速排序用到了分治思想，同样的还有归并排序。
     * 乍看起来快速排序和归并排序非常相似，都是将问题变小，先排序子串，最后合并。
     * 不同的是快速排序在划分子问题的时候经过多一步处理，将划分的两组数据划分为一大一小，
     * 这样在最后合并的时候就不必像归并排序那样再进行比较。但也正因为如此，划分的不定性使得快速排序的时间复杂度并不稳定。
     * 快速排序的基本思想：通过一趟排序将待排序列分隔成独立的两部分，其中一部分记录的元素均比另一部分的元素小，
     * 则可分别对这两部分子序列继续进行排序，以达到整个序列有序。
     * <p>
     * 算法步骤
     * 快速排序使用分治法（Divide and conquer）策略来把一个序列分为较小和较大的 2 个子序列，然后递回地排序两个子序列。
     * 具体算法描述如下：
     * 1、从序列中随机挑出一个元素，做为 “基准”(pivot)；
     * 2、重新排列序列，将所有比基准值小的元素摆放在基准前面，所有比基准值大的摆在基准的后面（相同的数可以到任一边）。
     * 在这个操作结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * 3、递归地把小于基准值元素的子序列和大于基准值元素的子序列进行快速排序。
     */
    public static void quickSort(int[] array, int low, int high) {
        System.out.println("---");
        if (low < high) {
            int position = partition(array, low, high);
            quickSort(array, low, position - 1);
            quickSort(array, position + 1, high);
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 11};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
