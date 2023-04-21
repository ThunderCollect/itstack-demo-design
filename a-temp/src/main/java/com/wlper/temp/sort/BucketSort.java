package com.wlper.temp.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: BucketSort
 * @Package: com.xjidp.hrsaas.temp.sort
 * @Description: 桶排序
 * @Author: Thunder
 * @Date: Created in 2023-04-21 08:51
 * @Version: V1.0.0
 */
public class BucketSort {
    /**
     * Gets the maximum and minimum values in the array
     *
     * @param arr
     * @return
     */
    private static int[] getMinAndMax(List<Integer> arr) {
        int maxValue = arr.get(0);
        int minValue = arr.get(0);
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            } else if (i < minValue) {
                minValue = i;
            }
        }
        return new int[]{minValue, maxValue};
    }

    /**
     * Bucket Sort
     * <p>
     * 桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。
     * 为了使桶排序更加高效，我们需要做到这两点：
     * 1、在额外空间充足的情况下，尽量增大桶的数量
     * 2、使用的映射函数能够将输入的 N 个数据均匀的分配到 K 个桶中
     * 桶排序的工作的原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，
     * 每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行。
     * <p>
     * 算法步骤
     * 1、设置一个 BucketSize，作为每个桶所能放置多少个不同数值；
     * 2、遍历输入数据，并且把数据依次映射到对应的桶里去；
     * 3、对每个非空的桶进行排序，可以使用其它排序方法，也可以递归使用桶排序；
     * 4、从非空桶里把排好序的数据拼接起来。
     *
     * @param arr
     * @return
     */
    public static List<Integer> bucketSort(List<Integer> arr, int bucket_size) {
        if (arr.size() < 2 || bucket_size == 0) {
            return arr;
        }
        int[] extremum = getMinAndMax(arr);
        int minValue = extremum[0];
        int maxValue = extremum[1];
        int bucket_cnt = (maxValue - minValue) / bucket_size + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucket_cnt; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int element : arr) {
            int idx = (element - minValue) / bucket_size;
            buckets.get(idx).add(element);
        }
        for (int i = 0; i < buckets.size(); i++) {
            if (buckets.get(i).size() > 1) {
                buckets.set(i, bucketSort(buckets.get(i), bucket_size / 2));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (List<Integer> bucket : buckets) {
            for (int element : bucket) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Integer[] arr = {20, 30, 44, 10, 4, 7, 3, 5, 22, 50};
        integers.addAll(Arrays.asList(arr));
        System.out.println(integers.toString());
        List<Integer> bucketSortResult = bucketSort(integers, integers.size());
        System.out.println(bucketSortResult.toString());
    }
}
