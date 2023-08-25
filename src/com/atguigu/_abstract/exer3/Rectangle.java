package com.atguigu._abstract.exer3;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public class Rectangle extends Graphic {
    private double length;
    private double  width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String detail() {
        return "长方形的长为："+length+"，长方形的长为："+width+"，面积是："+area();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
