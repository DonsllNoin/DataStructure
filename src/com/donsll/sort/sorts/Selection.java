package com.donsll.sort.sorts;

public class Selection {

    public static void sort(Comparable[] a){
        // 第一个循环用来定位 起始元素 的位置
        for (int i = 0; i < a.length - 2; i++) {

            // 先假设 起始元素 是最小的
            int minIndex = i;

            // 对比 起始元素 与 其他元素
            for (int j = i + 1; j < a.length; j++) {

                // i 是初始数目 ，j 是对比数目
                if (greater(a[minIndex], a[j])){
                    // 如果 minIndex 的值大 ，那就进行交换索引
                    minIndex = j;
                }
            }

            // 把利用最小元素的索引 ，来交换 最小元素 与 起始元素
            exch(a, i, minIndex);
        }

    }

    // 比较 v 元素是否大于 w 元素
    public static boolean greater(Comparable v, Comparable w){
        // result > 0 则 v > w，也就是 如果为 true ，则 需要进行交换
        int result = v.compareTo(w);
        return result > 0;

    }

    // 数组元素 i 和 j 交换位置
    public static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

}
