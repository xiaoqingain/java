package com.demo.array;

public class Test {
    public static void main(String[] args) {
        //1.定义数组存储5个人的年龄
        int [] add=new int []{11,13,15};
        //简化定义
        int[] add2={12,13,14};
        System.out.println(add[0]);
        System.out.println(add2[1]);
        System.out.println(add2[2]);
        //2.定义数组存储三个人的姓名
        String[] add3={"张三","李四","王五"};
        for (int i=0;i<add3.length;i++){
            System.out.println("我叫"+add3[i]);
        }
        //3.定义数组存储4个人的升高
        double[] add4={17.7,17.0,17.4,18.0};
        //打印
        for (int i=0;i<add4.length;i++) {
            System.out.println(""+i+"="+add4[i]);
        }
    }
}
