package com.donsll.sort.test;

public class FactorialTest {

    public static void main(String[] args) {
        // 求 n 的阶乘
        System.out.println("5 的阶乘为 ：" + factorial(10000000));

    }

    public static long factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }

    }

}
