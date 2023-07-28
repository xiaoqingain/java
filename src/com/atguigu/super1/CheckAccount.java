package com.atguigu.super1;

/**
 * @author : Yac
 * @date : 2023/7/24
 * @projectTeam :
 */
public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }
    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对可透支的账户的取钱的操作
     * @param amount 要取钱的数
     */
    @Override
    public void withdraw(double amount){
            if (getBalance()>=amount){
                super.withdraw(amount);
            }else if (getBalance()+overdraft>=amount){
                overdraft-=amount-getBalance();
                super.withdraw(amount);
            }else {
                System.out.println("超过可透支限额！");
            }

        }
}
