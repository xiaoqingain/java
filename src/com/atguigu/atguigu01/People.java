package com.atguigu.atguigu01;

public class People {
    String name;
    int age;
    String gender;
    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public int addAge(int addAge){
        addAge =addAge+showAge();
        return addAge;
    }

}
