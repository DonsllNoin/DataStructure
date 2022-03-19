package com.donsll.linear.test;

import com.donsll.linear.tables.SequenceList;

public class SequenceListTest {

    public static void main(String[] args) {
        // 创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);

        // 测试插入
        sl.insert("诺因");
        sl.insert("小诺");
        sl.insert("张诺茵");
        sl.insert("诺茵宝贝");
        sl.insert(1, "张小茵");

        // 测试获取
        String getResult = sl.get(1);
        System.out.println("索引 1 处的结果为 ：" + getResult);

        // 测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是 ：" + removeResult);

        // 测试清空
        sl.clear();
        System.out.println("清空后，线性表中的元素个数为 ：" + sl.length());

    }

}
