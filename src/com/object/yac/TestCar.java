package com.object.yac;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        /*
        定义数组储存3部汽车对象。
        汽车属性：品牌，价格，颜色。
        创建三个汽车对象，数据通过键盘录入而来，并把数据存入到当前数组中。
         */
        Car []arr=new Car[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            Car s1=new Car();
            System.out.println("请输入汽车品牌：");
            String brand= sc.next();
            s1.setBrand(brand);
            System.out.println("请输入汽车价格：");
            int price=sc.nextInt();
            s1.setPrice(price);
            System.out.println("请输入汽车颜色：");
            String colour=sc.next();
           s1.setColour(colour);
           arr[i]=s1;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car=arr[i];
            System.out.println("汽车品牌"+car.getBrand()+","+"汽车价格"+car.getPrice()+","+"汽车颜色"+car.getColour());
        }
    }
}
