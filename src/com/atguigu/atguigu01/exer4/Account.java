package com.atguigu.atguigu01.exer4;

/**
 * @author : Yac
 * @date : 2023/7/20
 * @projectTeam :
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
   public void deposit(double amt ){
       if (amt>0){
           balance =balance+amt;
           System.out.println("成功存入："+amt+"元");

       }else {
           System.out.println("你输入的金额有误");
       }

   }
   public void withdrew(double amt){
        if (amt<balance){
            balance-=amt;
            System.out.println("成功取钱："+amt+"元"+"你当前余额剩余："+balance+"元");
        }else {
            System.out.println("取钱失败，你的余额为："+balance);
        }
   }
}
