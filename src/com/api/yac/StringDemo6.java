package com.api.yac;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
//键盘录入一个字符串，统计该字符中大小写字符，小写字母字符，数字字符出现的次数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str= sc.next();
        int bigCount=0;
        int smallCount=0;
        int numCount=0;
        for (int i=0;i<str.length();i++){
            char str2=str.charAt(i);
            if (str2>='a'&&str2<='z'){
                bigCount++;
            } else if (str2>='A'&&str2<='Z') {
                smallCount++;
            } else if (str2>='0'&&str2<='9') {
                numCount++;
            }
        }
        System.out.println("小写字符有"+bigCount+"个");
        System.out.println("大写字符有"+smallCount+"个");
        System.out.println("小写字符有"+numCount+"个");
    }
}
