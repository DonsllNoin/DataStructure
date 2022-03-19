package com.donsll.sort.sorts;

public class Merge {
    // 归并所需要的辅助数组
    private static Comparable[] assist;

    // 比较 v 是否 小于 w
    private static boolean less(Comparable v, Comparable w) {
        // 左边的大 ，返回 1 . 右边的大 ，返回 -1
        return v.compareTo(w) < 0;
    }

    // 数组元素 i 和 j 交换位置
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

    // 对数组 a 中的元素进行排序
    public static void sort(Comparable[] a) {
        // 初始化辅助数组
        assist = new Comparable[a.length];

        // 定义 lo 和 hi 用来记录数据中 最小的索引 和 最大的索引 。
        int lo = 0;
        int hi = a.length - 1;

        // 调用 sort 重载方法来完成 lo 到 hi 之间的排序
        sort(a, lo, hi);

    }

    // 对数组 a 中从 lo 到 hi 的元素进行排序
    private static void sort(Comparable[] a, int lo, int hi) {
        // 安全性校验（递归停止标志）
        if (hi <= lo) {
            return;
        }

        // 记录下中间的索引 ( 直接 (lo+hi)/2 可能会造成内存溢出
        int mid = lo + (hi - lo) / 2;

        // 分别对每一组进行排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        // 把两组数据进行归并
        merge(a, lo, mid, hi);

    }

    // 对数组中 ，从 lo 到 mid 为一组 ，从 mid + 1 到 hi 为一组 ，对这两组数据进行归并
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // 1. 定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;

        // 2. 遍历 ，移动 p1 指针 和 p2 指针 ，比较索引处的值，找到小的那个，放到 辅助数组的指针 处
        while (p1 <= mid && p2 <= hi) {
            // 比较对应索引处的值
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }

        }

        // 3. 遍历，如果 p1 的指针 没有走完，那么顺序移动 p1 指针，把对应的元素放到 辅助数组的对应索引 处
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }

        // 4. 遍历，如果 p2 的指针 没有走完，那么顺序移动 p2 指针，把对应的元素放到 辅助数组的对应索引 处
        while (p2 <= hi) {
            assist[i++] = a[p2++];
        }

        // 5. 把 辅助数组中的元素 拷贝到 原数组 中
        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }

    }
}
