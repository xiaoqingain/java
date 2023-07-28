package com.methodetest.yac;

public class Test2 {
    public static void main(String[] args) {
        /*
       1. 需求定义一个方法，求长方形的周长。
       2.求一个圆的半径
         */
        //1.求长方形的周长。
         Per(2.3,5.5);
         //求一个圆的半径
        Per(2);
    }
    public static void Per(double num1,double num2){
            double result=(num1+num2)*2;
        System.out.println(result);
    }
    public static void Per(double num1){
        double result=num1*num1*3.14;
        System.out.println(result);
    }
}
