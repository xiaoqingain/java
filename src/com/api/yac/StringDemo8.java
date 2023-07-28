package com.api.yac;

public class StringDemo8 {
    public static void main(String[] args) {
        //定义一个方法，实现字符串转换
        //键盘录入一个字符串，调用方法后，在控制台输出结果(例如：键盘录入abc，输出结果cba)
        
        System.out.println(reverser("abc"));

    }
    public static String reverser(String str){
String result="";
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            result=result+c;
        }

        return result;
    }
}
