package com.atguigu.object.tostring;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class ToString {
    public static void main(String[] args) {
        Person p1=new Person("小王",18);
        System.out.println(p1);   //com.atguigu.object.tostring.Person@27d6c5e0  -->重写toString后 Person{name='小王', age=18}
        System.out.println(p1.toString());  //com.atguigu.object.tostring.Person@27d6c5e0 --> toString后 Person{name='小王', age=18}




    }
}
