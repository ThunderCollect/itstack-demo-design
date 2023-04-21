package com.wlper.temp.sort;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 冒泡排序
 * @Author: Thunder
 * @Date: Created in 2023-04-20 16:26
 * @Version: V1.0.0
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 冒泡排序是一种简单的排序算法。它重复地遍历要排序的序列，依次比较两个元素，如果它们的顺序错误就把它们交换过来。
     * 遍历序列的工作是重复地进行直到没有再需要交换为止，此时说明该序列已经排序完成。
     * 这个算法的名字由来是因为越小的元素会经由交换慢慢 “浮” 到数列的顶端。
     * <p>
     * 算法步骤
     * 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 3、针对所有的元素重复以上的步骤，除了最后一个；
     * 4、重复步骤 1~3，直到排序完成。
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                    System.out.println(arr[j] +" 与 " +arr[j+1]+" 交换");
                }else {
                    System.out.println(arr[j] +" 不大于 " +arr[j+1]+" 不交换");
                }
                System.out.println(Arrays.toString(arr));
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
