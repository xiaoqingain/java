package com.atguigu.polymorphism.exer2;

/**
 * @author : Yac
 * @date : 2023/7/28
 */
public class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("猫爱吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫爱抓老鼠");
    }
}
