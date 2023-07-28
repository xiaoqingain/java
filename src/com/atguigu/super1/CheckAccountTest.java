package com.atguigu.super1;

/**
 * @author : Yac
 * @date : 2023/7/25
 * @projectTeam :
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount ch1=new CheckAccount(1122,20000,0.,5000);
        ch1.withdraw(5000);
        System.out.println("您的账户余额为："+ch1.getBalance());
        System.out.println("您的账户可透支额："+ch1.getOverdraft());

        ch1.withdraw(18000);
        System.out.println("您的账户余额为："+ch1.getBalance());
        System.out.println("您的账户可透支额："+ch1.getOverdraft());

        ch1.withdraw(3000);
        System.out.println("您的账户余额为："+ch1.getBalance());
        System.out.println("您的账户可透支额："+ch1.getOverdraft());
    }
}
