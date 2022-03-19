package com.donsll.sort.sorts;

public class Quick {

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

    // 对数组内的元素进行排序
    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);

    }

    // 对数组 a 中从索引 lo 到 索引 hi 之间的元素进行排序
    private static void sort(Comparable[] a, int lo, int hi) {
        // 递归终止符
        if (hi <= lo) {
            return;
        }

        // 需要对数组中 lo 索引 到 hi 索引 处的元素进行分组（左子组，右子组）
        int partition = partition(a, lo, hi);   // 返回的是 分组的分界值 变化后 所在的索引

        // 让左子组有序（分界值 不需要 进行参与）
        sort(a, lo, partition - 1);

        // 让右子组有序（分界值 不需要 进行参与）
        sort(a, partition + 1, hi);

    }

    // 对数组 a 中，从索引 lo 到 索引 hi 之间的元素进行分组，并返回分组界限对应的索引
    // 在切分的过程中，也在对数据进行排序，因为切分的规则是 ：小的放左边，大的放右边
    public static int partition(Comparable[] a, int lo, int hi) {
        // 确定分界值（当前待切分元素的起始元素）
        Comparable key = a[lo];

        // 定义两个指针，分别指向待切分元素的 最小索引处 和 最大索引处的下一个位置
        int left = lo;
        int right = hi + 1;

        // 切分
        while (true) {
            // 先从右往左扫描，移动 right 指针，找到一个比分界值小的元素 ，停止
            while (less(key, a[--right])) {
                // 当指针到了 分界值 的时候，都还没有找到比分界值小的元素，那就停止
                if (right == lo) {
                    break;
                }
            }

            // 先从左往右扫描，移动 left 指针，找到一个比分界值大的元素 ，停止
            while (less(a[++left], key)) {
                // 当指针到了 分界值 的时候，都还没有找到比分界值小的元素，那就停止
                if (left == hi) {
                    break;
                }
            }

            // 判断是否 left >= right, 如果是，则说明扫描完毕，结束循环，
            if (left >= right) {
                break;

            } else {
                // 交换元素
                exch(a, left, right);
            }
        }

        // 更新分界值的位置（right 和 left 都可以）
        exch(a, lo, right);

        return right;
    }

}
