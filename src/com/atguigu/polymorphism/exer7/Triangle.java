package com.atguigu.polymorphism.exer7;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class Triangle extends Shap{
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
      double p=(a*b*c)/2;
      return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a*b*c;
    }

    @Override
    public String detail() {
        return "三角形的边长1："+a+",边长2："+b+",边长3："+c+","+super.detail();
    }
}
