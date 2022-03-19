package com.donsll.sort.sorts;

public class Shell {

    public static void sort(Comparable[] a) {
        // 1. 先确定 h 的初始值
        int h = a.length / 2;

        // 2. 进行 希尔排序
        while (h > 0) {

            // 2.1 外层的 for 用来从 第一个h 开始往后移
            for (int i = h; i < a.length; i++) {

                // 2.2 内层的 for 用来定位到 与当前元素 相隔 h 的 前面 那个元素
                for (int j = i; j >= h; j -= h) {

                    // 开始判断（ 已分配的元素（后面） 与 未分配的元素（前面） ）
                    if (greater(a[j-h], a[j])){
                        exch(a, j-h, j);

                    }else {
                        // 这个 else 要不要都行
                        break;
                    }

                }

            }

            // 调整 h 的值
            h = h / 2;
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
