package com.atguigu._innerclass.exer1;

/**
 * @author : Yac
 * @date : 2023/8/12
 */
public class TestAnonymousInner {
    public static void main(String[] args) {
        new Object(){
            public void method(){
                System.out.println("匿名内部的方法");
            }
        }.method();
        System.out.println("------------");
        MyInter my=new MyInter() {
            @Override
            public void method() {
                System.out.println("重写父接口的method方法");
            }

            @Override
            public void fub() {
                System.out.println("重写父接口的fub方法");
            }
        };
        my.method();
        my.fub();

    }
    interface MyInter{
        void  method();
        void fub();
    }
}
