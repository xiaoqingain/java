package com.demo.array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
        生成一个1~100随机值存入数组
        (1.求出所有数据的和
        (2.求出所以数据的平均值
        (3.统计有多少个数据比平均值小
         */
       // 1.定义一个动态数组
        int[] arr=new int [10];
       // 2.生成一个1~100随机值存入数组
        Random r=new Random();
        r.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            int number= r.nextInt(100)+1;
            arr[i]=number;

        }
        //求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
            sum=arr[1]+sum;

        }
        System.out.println("\n数据的和；"+sum);
        //(2.求出所以数据的平均值
        int j=0;
        j=sum / 10;
        System.out.println("数据的平均值；"+j);
        //(3.统计有多少个数据比平均值小
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<j){
                count++;
            }


        }
        System.out.println("数组中小于平均数的有："+count+"个");
    }
}
