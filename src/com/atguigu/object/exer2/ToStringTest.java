package com.atguigu.object.exer2;

import java.io.File;
import java.util.Date;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class ToStringTest {
    public static void main(String[] args) {
        // File、String、Date或包装类等Object的子类，它们都重写了Object类的toString(),
        // 在调用toString()时，返回当前对象的实体内容。
        File file=new File("D:\\abc.txt");
        System.out.println(file);

        String string=new String("abc");
        System.out.println(string);

        Date date=new Date();
        System.out.println(date);
    }

}
