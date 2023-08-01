package com.atguigu.object.equals;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1=new Customer("Tom",18,new Account(2000));
        Customer c2=new Customer("Tom",18,new Account(2000));
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);
    }
}
