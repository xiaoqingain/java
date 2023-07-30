package com.atguigu.polymorphism.exer4;

/**
 * @author : Yac
 * @date : 2023/7/28
 */
public class Rectangle extends  Graphic {
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
    public double area(){
        return length*width;
    }
}
