package com.atguigu.super1;

/**
 * @author : Yac
 * @date : 2023/7/24
 * @projectTeam :
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;


    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月历
     * @return
     */
    public double getMonthlyCalendar(){
return annualInterestRate/12;
    }

    /**
     * 取款的操作
     * @param amount 要取钱的数
     */
    public void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }else {
            System.out.println("余额不足！");
        }
    }

    /**
     * 存钱操作
     * @param amount 要存的额度
     */
    public void deposit(double amount){
       if (amount>0){
           balance+=amount;
       }
    }
}