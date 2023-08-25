package com.atguigu.exceptionhandling._finally;

/**
 * @author : Yac
 * @date : 2023/8/21
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        int num=test1("123");
        System.out.println(num);

    }
    public static int test1(String str){
        try{
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }finally {
            System.out.println("test1结束");
        }
    }
}
