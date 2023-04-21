package com.wlper.temp.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RadixSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 基数排序
 * @Author: Thunder
 * @Date: Created in 2023-04-21 09:10
 * @Version: V1.0.0
 */
public class RadixSort {

    /**
     * Radix Sort
     * <p>
     * 基数排序也是非比较的排序算法，对元素中的每一位数字进行排序，从最低位开始排序，
     * 复杂度为 O(n×k)，n 为数组长度，k 为数组中元素的最大的位数；
     *
     * 基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。
     * 有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优先级排序。
     * 最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
     * 基数排序基于分别排序，分别收集，所以是稳定的。
     * <p>
     * 算法步骤
     * 1、取得数组中的最大数，并取得位数，即为迭代次数 N（例如：数组中最大数值为 1000，则 N=4）；
     * 2、A 为原始数组，从最低位开始取每个位组成 radix 数组；
     * 3、对 radix 进行计数排序（利用计数排序适用于小范围数的特点）；
     * 4、将 radix 依次赋值给原数组；重复 2~4 步骤 N 次
     *
     * @param arr
     * @return
     */
    public static int[] radixSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int N = 1;
        int maxValue = arr[0];
        for (int element : arr) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        while (maxValue / 10 != 0) {
            maxValue = maxValue / 10;
            N += 1;
        }
        for (int i = 0; i < N; i++) {
            List<List<Integer>> radix = new ArrayList<>();
            for (int k = 0; k < 10; k++) {
                radix.add(new ArrayList<Integer>());
            }
            for (int element : arr) {
                int idx = (element / (int) Math.pow(10, i)) % 10;
                radix.get(idx).add(element);
            }
            int idx = 0;
            for (List<Integer> l : radix) {
                for (int n : l) {
                    arr[idx++] = n;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l + 1); // -9223372036854775808
        System.out.println(l + 1 == Long.MIN_VALUE); // true


//        int[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
//        System.out.println(Arrays.toString(arr));
//        radixSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
