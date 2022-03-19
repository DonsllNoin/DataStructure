package com.donsll.sort.test;

import com.donsll.sort.sorts.Insertion;

import java.util.Arrays;

public class InsertionTest {

    public static void main(String[] args) {

        Integer[] a = {4, 3, 2, 5, 6, 8, 9, 7, 12, 10};

        Insertion.sort(a);

        System.out.println(Arrays.toString(a));

    }

}
