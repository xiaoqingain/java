package com.atguigu.exceptionhandling._finally;

/**
 * @author : Yac
 * @date : 2023/8/21
 */
public class FinallyTest2 {
    public static void main(String[] args) {
        int result=test2(10);
        System.out.println(result);
    }
    public static int test2(int num){
        try {
            return num;
        }catch (NumberFormatException e){
            return -num;
        }finally {
            System.out.println("test结束了");
            //return ++num;
            ++num;
        }
    }
}
