package com.api.yac;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        /*
        已知用户名和密码，请用程序实现模拟用户登陆。
        总共有三次机会，三次以后，给出对应的提示
         */
        String username="andon";
        String password="123456";
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< 3;i++) {
            System.out.println("请输入用户名");
            String uname=sc.next();
            System.out.println("请输入密码");
            String ps=sc.next();
            if (username.equals(uname) && password.equals(ps)) {
                System.out.println("恭喜你，登陆成功");
                break;
            }else {
                if (i==2){
                    System.out.println("用户"+username+"已经被锁定请联系管理员");
                }else {
                    System.out.println("登陆失败，您输入用户名或密码错误，您还剩下" + (2 - i) + "机会");
                }
            }
        }
    }
}
