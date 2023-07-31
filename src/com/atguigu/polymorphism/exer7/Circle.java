package com.atguigu.polymorphism.exer7;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Circle extends Shap{
    private double radius;   //半径

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
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String detail() {
        return "圆的半径："+radius+ ","+super.detail();
    }
}
