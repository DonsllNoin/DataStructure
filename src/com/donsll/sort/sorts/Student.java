package com.donsll.sort.sorts;

// 定义一个学生类 ，具有 age 和 username ，并通过 Comparable 接口
public class Student implements Comparable<Student> {

    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 根据 年龄 进行比较
        return this.getAge() - o.getAge();
    }
}
