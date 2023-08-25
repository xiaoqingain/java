package com.atguigu._abstract.exer3;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public class Circle extends Graphic{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String detail() {
        return "圆的半径是："+radius+"，面积是："+area();
    }
}
