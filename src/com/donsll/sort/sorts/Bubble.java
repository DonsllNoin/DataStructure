package com.donsll.sort.sorts;

public class Bubble {

    // 对数组 a 中的数据进行排序
    public static void sort(Comparable[] a){

        for (int i = a.length - 1; i > 0; i--) {
            // 每进行一次冒泡 ，需要进行对比的元素就 - 1，每次都会弄到一个最大值到后面
            for (int j = 0; j < i; j++) {
                // 比较索引 j 和 j + 1 的值
                if (greater(a[j], a[j+1])){
                    exch(a, j, j+1);
                }
            }
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
