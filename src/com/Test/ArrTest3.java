package com.Test;

import java.util.Scanner;

public class ArrTest3 {
    public static void main(String[] args) {
        //记录3和5的个数；
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入开始值");
        int x= sc.nextInt();
        System.out.println("请输入结束值");
        int y= sc.nextInt();
        for (int i = x; i <= y; i++) {
           // System.out.println(i);
            if (i%3==0 &&i%5==0){
                sum++;
            }

        }
        System.out.println(sum);
    }

}
