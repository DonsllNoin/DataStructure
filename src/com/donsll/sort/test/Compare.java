package com.donsll.sort.test;

import com.donsll.sort.sorts.Quick;
import com.donsll.sort.sorts.Shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Compare {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 ArrayList 集合 ，保存读取出来的整数
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 创建缓存读取流 ，读取数据 ，存到 List 中
        BufferedReader reader = new BufferedReader(new InputStreamReader(Compare.class.getClassLoader()
                .getResourceAsStream("data1000.txt")));

        // 2.1 开始读取数据
        String line = null;
        while ((line = reader.readLine()) != null){
            int i = Integer.parseInt(line);
            list.add(i);

        }
        reader.close();

        // 3. 把 List 转换成数组
        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        // 4. 测试代码
        testShell(a);
        testQuick(a);


    }

    // 测试希尔排序
    public static void testShell(Integer[] a) {
        // 1. 获取 执行之前 的时间
        long start = System.currentTimeMillis();

        // 2. 执行算法代码
        Shell.sort(a);

        // 3. 获取 执行之后 的时间
        long end = System.currentTimeMillis();

        // 4. 算出程序执行的时间 ，并输出
        System.out.println("希尔排序的执行时间为 ：" + ((end - start)) + " 毫秒");

    }

    // 测试插入排序
    public static void testQuick(Integer[] a) {
        // 1. 获取 执行之前 的时间
        long start = System.currentTimeMillis();

        // 2. 执行算法代码
        Quick.sort(a);

        // 3. 获取 执行之后 的时间
        long end = System.currentTimeMillis();

        // 4. 算出程序执行的时间 ，并输出
        System.out.println("快速排序的执行时间为 ：" + ((end - start)) + " 毫秒");

    }

}
