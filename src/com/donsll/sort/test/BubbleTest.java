package com.donsll.sort.test;

import com.donsll.sort.sorts.Bubble;

import java.util.Arrays;

public class BubbleTest {

    public static void main(String[] args) {

        // 包装类 实现了 Comparable 接口
        Integer[] arr = {4, 5, 6, 2, 3, 1};

        Bubble.sort(arr);

        // 打印数组
        System.out.println(Arrays.toString(arr));

    }

}
