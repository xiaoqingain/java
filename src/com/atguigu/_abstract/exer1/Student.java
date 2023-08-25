package com.atguigu._abstract.exer1;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public class Student extends People{
   public Student(){
       super();
   }
    @Override
    public void eat(){
        System.out.println("学生要吃有营养的食物");

    }
    @Override
    public void sleep(){
        this.eat();
        System.out.println("学生要多睡觉");
    }
}
