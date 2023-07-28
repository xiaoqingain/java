package com.atguigu.polymorphism.exer1;

/**
 * @author : Yac
 * @date : 2023/7/28
 * @projectTeam :
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Man();
        p1.eat();
        p1.walk();
        //测试属性是否满足多态性？不满足
        System.out.println(p1.id);



    }
}
