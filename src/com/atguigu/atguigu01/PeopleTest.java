package com.atguigu.atguigu01;

public class PeopleTest {
    public static void main(String[] args) {
        People p1=new People();
        p1.name="杰克";
        p1.age=18;
        p1.gender="男";
        p1.study();
        System.out.println();
        System.out.println(p1.showAge());
        System.out.println(p1.addAge(2));

    }
}
