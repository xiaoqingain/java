package com.atguigu._abstract.exer1;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
 abstract class People {
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public abstract void eat();
    public void sleep(){
        System.out.println("人睡觉");
    }
}
