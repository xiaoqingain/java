package com.api.yac;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我用键盘录入一个"abc"
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入abc");
        String str1=sc.next();

        //2.在代码中再定义一个字符串"adc"
        String str2="abc";
        //3.用==比较，两者相等吗？
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
