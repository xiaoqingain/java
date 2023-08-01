package com.atguigu.object.exer3;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle("red",1.0,3.4);
        System.out.println("颜色是否相等？"+c1.getColor().equals(c2));
        System.out.println("半径是否相等？"+c1.equals(c2));
        System.out.println(c1);
        System.out.println(c1.toString());

    }
}
