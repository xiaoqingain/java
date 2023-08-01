package com.atguigu.object.exer3;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class Circle extends GeometricObject {
   private double radius;

    public Circle() {
//        color="white";
//        weight=1.0;
        radius=1.0;
    }

    public Circle(double radius) {
//        color="white";
//        weight=1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * 圆的面积
     */
    public double findRadius(){
        return Math.PI*(radius/2);
    }
    /**
     * 重写equals()方法
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
    /**
     * 重写toString()方法
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
