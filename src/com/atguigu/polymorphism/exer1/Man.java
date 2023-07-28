package com.atguigu.polymorphism.exer1;

/**
 * @author : Yac
 * @date : 2023/7/28
 * @projectTeam :
 */
public class Man extends Person {
    int id=1002;
    @Override
    public void eat() {
        System.out.println("男人多吃肉");
    }

    @Override
    public void walk() {
        System.out.println("男人笔挺的走路");

    }
    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }
}