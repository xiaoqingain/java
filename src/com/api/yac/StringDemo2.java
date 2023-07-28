package com.api.yac;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String str1=new String("abc");
        String str2="abc";
        //2.==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(str1==str2);

        //3.比较字符串对象内容是否相等,使用equals比较
        boolean result1=str1.equals(str2);
        System.out.println(str1.equals(str2));
        System.out.println(result1);

        //4.比较字符串对象中的内容是否相等,忽略大小写.使用equalsIgnoreCase。
        String str3=new String("abc");
        String str4="ABC";
        //equals区分大小写
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
         }
}
