package com.atguigu.polymorphism.exer7;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Rectangle extends Shap{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length*width);
    }

    @Override
    public String detail() {
        return "长方形的长："+length+"，宽："+","+width+super.detail();
    }
}
