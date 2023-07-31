package com.atguigu.polymorphism.exer5;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class DogTest {
    public static void main(String[] args) {
        Animal a1=new Dog();

        System.out.println(((Dog) a1).name);//向下转型
        System.out.println(a1.a);
        System.out.println(((Dog)a1).a);//向下转型
        ((Dog)a1).eat();
        Dog dog=new Dog();
        System.out.println("-------------");
        dog.eat();
        System.out.println(dog.a);
        System.out.println(((Animal)dog).a);//向上转型


    }
}
