package com.atguigu.polymorphism.exer2;

/**
 * @author : Yac
 * @date : 2023/7/28
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.eat();      //执行的是子类重写的方法
//      cat.catchMouse //编译保存
    }
}
