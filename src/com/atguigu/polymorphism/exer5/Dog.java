package com.atguigu.polymorphism.exer5;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Dog extends Animal{
    int a=3;
    String name="狗";
    @Override
    public void eat(){
        System.out.println("狗狗爱吃骨头");
    }
}
