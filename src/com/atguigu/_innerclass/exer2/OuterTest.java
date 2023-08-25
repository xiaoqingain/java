package com.atguigu._innerclass.exer2;

/**
 * @author : Yac
 * @date : 2023/8/11
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer o1=new Outer();
        o1.test1();
        System.out.println("-------------");

        Outer.Inner1 inner1=o1.new Inner1();
        inner1.method();
        System.out.println("-------------");
        Outer.Inner2 inner2=new Outer.Inner2();
        inner2.method();
        Outer.Inner2.fun();

    }
}
