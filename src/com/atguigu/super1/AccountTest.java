package com.atguigu.super1;

/**
 * @author : Yac
 * @date : 2023/7/24
 * @projectTeam :
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1=new Account(001,20000.0,0.045);
        a1.withdraw(30000);
        System.out.println("您的账户余额为："+a1.getBalance());
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("您的账户余额为："+a1.getBalance());
        System.out.println("月利率为："+a1.getMonthlyCalendar());
    }
}
