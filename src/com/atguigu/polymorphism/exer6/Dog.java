package com.atguigu.polymorphism.exer6;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void cry(){
        System.out.println("汪汪的叫声");
    }
}
