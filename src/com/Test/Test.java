package com.Test;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random r=new Random();
        int sum=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
       // System.out.println("请输入你的抽奖号码1-100");
        int cont=0;
        while (true){
            cont++;
            int sub= sc.nextInt();
            System.out.println("请输入你的抽奖号码1-100");
            if (cont==3){
                System.out.println("恭喜你中奖了");
                break;
            }
            if (sub<sum){
                System.out.println("你输入的值小了");
            } else if (sub>sum) {
                System.out.println("你输入的值大了");
            }else {
                System.out.println("恭喜你中奖了");
                break;
            }

        }
    }
}

