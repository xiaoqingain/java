package com.demo.object;

/**
 * @author Ryan
 */
public class StudentMethod {
    public static void main(String[] args) {
        Student2 stu=new Student2("小诗诗",18);
        stu.eat();
        System.out.println(stu.intr());
        Student2 stu2=new Student2("小婷婷");
        stu.eat();

    }
}
class Student2{
    //成员变量
   private String name;
    private int age;
    Student2(){

    }
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student2(String name){
        this.name=name;

    }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
    public String intr(){
        return "我叫"+name+"今年"+age+"岁";
    }
}