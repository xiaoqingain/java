package com.atguigu.polymorphism.exer1;

/**
 * @author : Yac
 * @date : 2023/7/28
 * @projectTeam :
 */
public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("女人应该少吃肥肉，减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人优雅的");
    }
    public void goShopping(){
        System.out.println("女人逛商场...");
    }
}
