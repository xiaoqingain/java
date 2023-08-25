package com.atguigu.exceptionhandling._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Yac
 * @date : 2023/8/21
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();
    }
    public static void method3(){
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
    }
    public static void method2()throws FileNotFoundException,IOException{
        method1();
    }

    public static void method1()throws FileNotFoundException,IOException {
        File file=new File("D:\\hello.txt");
        FileInputStream fis=new FileInputStream(file);// 可能会出现FileNotFoundException

        int data=fis.read();//可能会出现 IOException

        while (data!=-1){
            System.out.print((char) data );
            data=fis.read();
        }
        fis.close();

    }
}
