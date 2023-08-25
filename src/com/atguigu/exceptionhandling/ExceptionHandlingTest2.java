package com.atguigu.exceptionhandling;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Yac
 * @date : 2023/8/20
 */
public class ExceptionHandlingTest2 {
    @Test
    public void test8() {
        FileInputStream fis=null;
        try {
            File file=new File("D:\\hello1.txt");
            fis=new FileInputStream(file);// 可能会出现FileNotFoundException

            int data=fis.read();//可能会出现 IOException

            while (data!=-1){
                System.out.print((char) data );
                data=fis.read();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fis!=null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
