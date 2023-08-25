package com.atguigu._annotation.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author : Yac
 * @date : 2023/8/14
 */
public class JUnitTest {

    @Test
    public  void test1(){
        System.out.println("hello");
    }
    @Test
     public   void test2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=sc.nextInt();
        System.out.println("hello"+num);
    }
}
