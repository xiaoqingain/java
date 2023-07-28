package com.Test;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        /*需求：生产10个1-100之间的随机数存入数组。
            1.求所有数据的和
            2.求所有数据的平均值
            3.统计有多少个比平均数小
         */
        Random r=new Random();
        int []arr=new int[10];
        int sum=0;
        int cont=0;

        for (int i = 0; i < arr.length; i++) {
            //每次循环获取一个随机数
            int number = r.nextInt(100) + 1;
            //把生成的随机数放入数组
            arr[i] = number;
            //遍历数组
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            //数组求和
            sum+=arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<sum/arr.length){

                cont++;
            }
        }

        System.out.println("数组的所有和为："+sum);
        System.out.println("数组中平均值为："+sum/arr.length);
        System.out.println("在数组中，一共有："+cont+"个数据，比平均数小");
    }
}
