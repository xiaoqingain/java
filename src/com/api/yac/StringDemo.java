package com.api.yac;

public class StringDemo {
    public static void main(String[] args) {
        String name ="张三";
        System.out.println(name);
        //空参构造：可以获取一个空白的字符串对象
        String str1=new String();
        System.out.println(str1);

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String str2=new String("abc");
        System.out.println(str2);

        //传递一个字符串数组，根据传递的字符串数组内容在创建一个新的字符串对象
        //需求：修改字符串内容。bcd Qbc
        //bcd -->{'b','c','d'} --{'Q','b','c'}
        char[]s3={'b','c','d'};
        String str3=new String(s3);
        s3[0]='Q';
        s3[1]='b';
        s3[2]='c';
        String str4=new String(s3);
        System.out.println(str3);
        System.out.println(str4);

        //传递一个字节数组。根据字节数组的内容在创建一个新的字符串对象。
        //应用场景：以后在自己，网络当中传输的数据其实都是字节码信息
        //我们一般要把字节码信息进行转换，转成字符串
        byte[] bt={97,98,99,100};
        String str5=new String(bt);
        System.out.println(str5);

    }
}
