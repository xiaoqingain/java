package com.atguigu.polymorphism.exer6;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1=new Dog();
        if (animal1 instanceof Dog){
            Dog dog=(Dog)animal1;//安全

            dog.cry();
            dog.eat();
            System.out.println("第一只狗狗");
        }
        Animal animal2=new Animal();
        // Dog dog1=(Dog)animal2;  //运行报错ClassCastException
        if (animal2 instanceof Dog){
            System.out.println("第二只狗狗");
            Dog dog1=(Dog)animal2;
            dog1.cry();
            dog1.eat();
        }

    }
}
