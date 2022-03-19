package com.donsll.sort;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Numbers {

    public static void main(String[] args) {
        // 将文件存到 当前工程文件夹 目录下
        String filepath = System.getProperty("user.dir");
        filepath += "\\data1000.txt";
        System.out.println(filepath);

        try {
            File file = new File(filepath);
            if (!file.exists()) {            //如果不存在data.txt文件则创建
                file.createNewFile();
                System.out.println("data1000.txt创建完成");
            }

            FileWriter fw = new FileWriter(file);        //创建文件写入
            BufferedWriter bw = new BufferedWriter(fw);

            //产生数据，写入文件
            for (int i = 1000; i > 0; i--) {
                bw.write(String.valueOf(i));        //写入一个随机数
                bw.newLine();        //新的一行
            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
