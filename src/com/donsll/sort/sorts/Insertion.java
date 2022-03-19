package com.donsll.sort.sorts;

public class Insertion {

    public static void sort(Comparable[] a) {

        // 未分配为 i ，已分配为 j
        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0; j--) {

                // 对比 j 和 j-1 ，j-1 大的话 ，就交换 ，不大就继续对比
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                }

            }

        }
    }

    // 比较 v 元素是否大于 w 元素
    public static boolean greater(Comparable v, Comparable w) {
        // result > 0 则 v > w，也就是 如果为 true ，则 需要进行交换
        int result = v.compareTo(w);
        return result > 0;

    }

    // 数组元素 i 和 j 交换位置
    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

}
