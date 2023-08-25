package com.atguigu._Interface.exer3;

/**
 * @author : Yac
 * @date : 2023/8/8
 */
public class Circle {
   private double record;

    public Circle() {
    }

    public Circle(double record) {
        this.record = record;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "record=" + record +
                '}';
    }
}
