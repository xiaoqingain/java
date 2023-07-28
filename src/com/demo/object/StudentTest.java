package com.demo.object;

/**
 * @author Ryan
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="小飞飞";
        stu.age=18;
        stu.sex="女";
        stu.eat();
        System.out.println(stu.self());
        System.out.println();


    }
}
//定义一个学生类

class Student{
    /**属性-成员变量*/
     String name;
    int age;
    String sex;
    /**方法*/
   public void eat(){
        System.out.println("吃饭");
    }
   public String self(){
        return name+"在吃饭";
    }

}