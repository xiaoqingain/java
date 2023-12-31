package com.atguigu.polymorphism.exer4;

/**
 * @author : Yac
 * @date : 2023/7/28
 */
public class Circle extends Graphic {
    private double radius;  //半径
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
