package com.donsll.linear.tables;

// <T> : 是泛型的默认值，可以被 任意类型 给替代
public class SequenceList<T> {
    // 存储元素的数组
    private T[] eles;

    // 记录 当前顺序表 中的 元素 的个数
    private int N;

    // 构造方法
    public SequenceList(int capacity) {
        // 初始化 数组
        this.eles = (T[]) (new Object[capacity]);

        // 初始化 长度
        this.N = 0;

    }

    // 将一个线性表置为空表
    public void clear() {
        this.N = 0;
    }

    // 判断当前线性表是否为空表
    public boolean isEmpty() {
        return N == 0;
    }

    // 获取 线性表的 长度
    public int length() {
        return N;
    }

    // 获取 指定位置的 元素
    public T get(int i) {
        return eles[i];
    }

    // 向 线性表中 添加元素 t
    public void insert(T t) {
        // 添加元素之后，指针向后移
        eles[N++] = t;
    }

    // 在 i 元素处插入元素 t
    public void insert(int i, T t) {
        // 把 i 索引后的元素往后移
        for (int index = N - 1; index > i; index--) {
            eles[index + 1] = eles[index];
        }

        // 插入元素
        eles[i] = t;
    }

    // 删除指定位置 i 处的元素，并返回该元素
    public T remove(int i) {
        // 先保存下 i 处的值
        T temp = eles[i];

        // 删除 i 处的值，并将 i 后的元素往左移
        for (int index = N - 1; index > i; index--) {
            eles[index - 1] = eles[index];
        }

        // 元素个数 - 1
        N--;

        return temp;
    }

    // 查找 t 元素第一次出现的位置
    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            // 判断 当前的元素 是否跟 要查找的元素 相同
            if (eles[i].equals(t)) {
                return i;
            }

        }

        // 表示 没有 在顺序表中找到该元素。
        return -1;
    }
}







