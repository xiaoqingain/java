package com.atguigu.atguigu01.exer4;

/**
 * @author : Yac
 * @date : 2023/7/20
 * @projectTeam :
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
   public Bank(){
       customers=new Customer[10];
    }
    public void addCustomer(String f,String l){
        Customer cust=new Customer(l,f);
        customers[numberOfCustomer++]=cust;

    }

    public int getNumberOfCustomer() {

       return numberOfCustomer;
    }
    public Customer getCustomer(int index) {
        if (index<0||index>=numberOfCustomer){
            return null;
        }
        return customers[index];
    }
}
