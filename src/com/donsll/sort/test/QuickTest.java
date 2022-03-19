package com.donsll.sort.test;

import com.donsll.sort.sorts.Quick;

import java.util.Arrays;

public class QuickTest {

    public static void main(String[] args) {

        Integer[] a = {5, 4, 6, 7, 3, 8, 2, 9, 1, 0};

        Quick.sort(a);

        System.out.println(Arrays.toString(a));

    }

}
