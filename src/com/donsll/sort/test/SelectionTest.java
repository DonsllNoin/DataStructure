package com.donsll.sort.test;

import com.donsll.sort.sorts.Selection;

import java.util.Arrays;

public class SelectionTest {

    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {4, 6, 8, 9, 3, 5, 2, 1};

        Selection.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
