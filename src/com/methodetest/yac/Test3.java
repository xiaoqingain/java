package com.methodetest.yac;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义一个方法求2长方形的面积，并经行比较
         */
      double area1 = getArea(2.3,3.5);
        System.out.println(area1);
      double area2=getArea(3.1,1.8);
        System.out.println(area2);

      if (area1>area2){
          System.out.println("第一个长方形面积大");
      }else {
          System.out.println("第二个长方形面积大");
      }
    }
    public static double getArea(double len,double width){
        double area=len*width;
        return area;
    }
}
