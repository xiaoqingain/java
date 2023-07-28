package com.atguigu.atguigu01.exer3;

/**
 * @author : Yac
 * @date : 2023/7/20
 * @projectTeam :
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想取"+girl.getName());

    }
    public void shout(){
      if (age>=22){
          System.out.println("我就可以结婚了");
      }else {
          System.out.println("在等等");
      }
    }
}
