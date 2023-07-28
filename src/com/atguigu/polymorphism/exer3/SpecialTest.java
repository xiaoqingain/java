package com.atguigu.polymorphism.exer3;

/**
 * @author : Yac
 * @date : 2023/7/28
 */
public class SpecialTest {
    public static void main(String[] args) {
        Father father=new Son();
        //访问的任然是父类
        System.out.println( "father.a = "+father.a);
        //执行的仍然是父类的method
        father.method();
    }

}
class Father{
    int a=1;
    public static void method(){
        System.out.println("父类的静态方法");
    }
}
class  Son extends Father{
    int a=2;
    public static void method() {
        System.out.println("子类的静态方法");
    }
}
