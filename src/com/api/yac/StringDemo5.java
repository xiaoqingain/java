package com.api.yac;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //遍历字符串。要求键盘录入一个字符串，使用程序实在控制台遍历该字符串。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
      String str= sc.next();
      for (int i=0;i<str.length();i++){
          char str2=str.charAt(i);


          System.out.println(str2);
      }
    }
}
