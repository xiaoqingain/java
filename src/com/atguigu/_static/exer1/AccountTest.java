package com.atguigu._static.exer1;

/**
 * @author : Yac
 * @date : 2023/8/3
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1=new Account();
        System.out.println(acc1.toString());
        Account acc2=new Account("123456",20000);
        System.out.println(acc2);
        Account.setInterestRate(0.00123);
        System.out.println("银行存款的利率为："+Account.getInterestRate());
        System.out.println("银行最小存款额度为："+Account.getMinBalance());
    }
}
