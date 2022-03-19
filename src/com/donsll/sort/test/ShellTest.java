package com.donsll.sort.test;

import com.donsll.sort.sorts.Shell;

import java.util.Arrays;

public class ShellTest {

    public static void main(String[] args) {
        Integer[] a = {9, 2, 3, 4, 1, 6, 7, 8, 12, 11, 15, 14};

        Shell.sort(a);

        System.out.println(Arrays.toString(a));


    }

}
