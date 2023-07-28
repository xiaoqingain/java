package com.atguigu.atguigu01.exer4;

/**
 * @author : Yac
 * @date : 2023/7/20
 * @projectTeam :
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.addCustomer("斯","李");
        b1.addCustomer("三","张");
        b1.getCustomer(0).setAccount(new Account(100));
        b1.getCustomer(0).getAccount().deposit(500);
        System.out.println(b1.getCustomer(0).getAccount().getBalance());

    }
}
