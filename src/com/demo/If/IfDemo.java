package com.demo.If;

import java.util.Scanner;

public class IfDemo{
    public static void main(String[] args) {
        //获得一个系统变量
        System.out.println("请输入您的成绩：");
        Scanner scanner=new Scanner(System.in);
        //得到一个整数
        int num=scanner.nextInt();
        if (num<60){
            System.out.println("不及格");

        } else if (num<=70) {

            System.out.println("良好");

        }else {
            System.out.println("优秀");
        }
    }
}
