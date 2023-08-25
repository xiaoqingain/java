package com.atguigu._static.apply;

/**
 * @author : Yac
 * @date : 2023/8/2
 */
public class Circle {
    private double radius;
    private int id;
     private static int total=1001;
public Circle(int total){
    this.id=total;
    total++;
}
    public Circle() {
    }

    public Circle(double radius, int id) {
        this.radius = radius;
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
