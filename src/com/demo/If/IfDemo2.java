package com.demo.If;

public class IfDemo2 {
    public static void main(String[] args) {
        //判断您是否成年如果成年了就可以去网吧否则回家学习去
        int age=25;
        if (age>18){
            System.out.println("你可以去网吧了");
        }else {
            System.out.println("回家学习去吧");
        }
        //判断你的年龄阶段
        if (age>60){
            System.out.println("老年");
        } else if (age>=40) {
            System.out.println("中年");

        }else {
            System.out.println("少年");
        }

    }
}
