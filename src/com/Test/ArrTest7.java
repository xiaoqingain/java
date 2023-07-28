package com.Test;

import java.util.Scanner;

public class ArrTest7 {
    public static void main(String[] args) {
            //使用键盘录入5个随机数，并遍历数组得到每一个元素
        int[]arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int b= sc.nextInt();
            arr[i]=arr[i]+b;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
