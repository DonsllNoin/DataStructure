package com.donsll.sort.test;

import com.donsll.sort.sorts.Student;

// 定义 Test ，测试方法 Comparable getMax(Comparable c1, Comparable c2)
public class TestComparable {

    public static void main(String[] args) {
        // 创建两个 Student 对象 ，调用 getMax 方法

        Student student1 = new Student();
        student1.setAge(18);
        student1.setUsername("董师龙");

        Student student2 = new Student();
        student2.setAge(16);
        student2.setUsername("张诺茵");

        Comparable max = getMax(student1, student2);

        System.out.println("年龄最大的是 ：" + max);

    }

    public static Comparable getMax(Comparable c1, Comparable c2){

        // 如果返回值 < 0 ，则 c1 < c2 反之 c1 > c2
        int result = c1.compareTo(c2);

        if (result < 0){
            return c2;
        }else{
            return c1;
        }

    }

}
