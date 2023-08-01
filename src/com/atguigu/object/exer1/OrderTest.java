package com.atguigu.object.exer1;

/**
 * @author : Yac
 * @date : 2023/8/1
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1=new Order(001,"Tom");
        Order order2=new Order(002,"Tom");
        System.out.println(order1.equals(order2));
    }

}
