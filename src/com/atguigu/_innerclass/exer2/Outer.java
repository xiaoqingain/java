package com.atguigu._innerclass.exer2;

/**
 * @author : Yac
 * @date : 2023/8/11
 */
public class Outer {
    private static int a;
    private int b;
    class Inner1{
        private int c;
        public void method(){
            System.out.println("非静态内部类的非静态方法");
            System.out.println("a= "+a);
            System.out.println("b= "+b);
        }
    }
    static class Inner2 {
        public void method() {
            System.out.println("静态内部类的非静态方法");
            System.out.println("a= " + a);
            //编译报错，因为Inner2是静态的，而b是非静态的
           // System.out.println("b= " + b);
        }
        public static void fun(){
            System.out.println("静态内部类的静态方法");
            System.out.println("a= " + a);
            //编译报错，因为Inner2是静态的，而b是非静态的
            //System.out.println("b= " + b);

        }

    }
    public void test1(){
        Inner1 inner1=new Inner1();
        System.out.println(inner1.c);
        inner1.method();
        Inner2 inner2=new Inner2();
        inner2.method();
        //不需要 Inner2的对象，因为fun是静态的方法；
       Inner2.fun();

    }

}
