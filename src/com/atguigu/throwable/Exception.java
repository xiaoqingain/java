package com.atguigu.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : Yac
 * @date : 2023/8/18
 */
public class Exception {
    //************运行时异常******************
    /**
     * 数组索引越界异常:ArrayIndexOutOfBoundsException
     */
    @Test
    public void test1(){
        int[] arr=new int[10];
        System.out.println(arr[10]);
    }
    /**
     * 空指针异常:NullPointerException
     */
    @Test
    public void test2(){
        int[] arr=new int[10];
        arr=null;
        System.out.println(arr);
    }

    /**
     * 类强制转换异常:ClassCastException
     */
    @Test
    public void test3(){
        Object obj=new String();
        //String str = (String) obj;
        Date date=(Date) obj;
    }
    /**
     * 编号格式异常:NumberFormatException
     */
    @Test
    public void test4(){
        String str="a123";
       Integer.parseInt(str);
    }
    /**
     * 输入不匹配异常:InputMismatchException
     */
    @Test
    public void test5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
       int a= sc.nextInt();
    }
    /**
     * 算术异常:ArithmeticException
     */
    @Test
    public void test6(){
        int num=10;
        System.out.println(num/0);
    }
//************编译时异常******************
    /**
     * 未找到类别异常:ClassNotFoundException
     */
    @Test
    public void test7()throws ClassNotFoundException{
        Class cla=Class.forName("java.lang.String");
    }
    /**
     * 找不到文件异常:FileNotFoundException
     * IOException
     */
    @Test
    public void test8()throws FileNotFoundException,IOException{
        File file=new File("G:\\hello.txt");
        FileInputStream fis=new FileInputStream(file);// 可能会出现FileNotFoundException

        int data=fis.read();//可能会出现 IOException

        while (data!=-1){
            System.out.print((char) data );
            data=fis.read();
        }
        fis.close();
    }
}
