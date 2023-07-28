package com.demo.array;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //创建一个动态数组
        String[] names=new String[3];
        saveName(names);
        gttName(names);


    }
    //观众姓名存入数组
    public static void saveName(String[] names){
        //获取一个系统变量
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入您的姓名：");
            String name= sc.next();
            names[i]=name;
        }
    }
    public static void gttName(String[] names){
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
