package com.atguigu.exceptionhandling;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author : Yac
 * @date : 2023/8/20
 */
public class ExceptionHandlingTest {
    @Test
    public void Test1(){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("请输入：");
            int num=sc.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("出现了：InputMismatchException");
        }
        System.out.println("异常结束了");
    }
    @Test
    public void test4(){
        try{
            String str="a123";
            int i=Integer.parseInt(str);

            System.out.println(i);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
