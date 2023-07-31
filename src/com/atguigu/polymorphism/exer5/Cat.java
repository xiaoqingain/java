package com.atguigu.polymorphism.exer5;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Cat extends Animal{
    int a=2;
    String name="猫";
    @Override
    public void eat(){

        System.out.println("猫爱吃鱼");
    }
}
