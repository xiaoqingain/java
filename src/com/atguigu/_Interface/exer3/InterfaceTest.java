package com.atguigu._Interface.exer3;

/**
 * @author : Yac
 * @date : 2023/8/8
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareCircle c1=new CompareCircle(2.3);
        CompareCircle c2=new CompareCircle(5.3);
        int compareValue=c1.compareTo(c2);
        if (compareValue>0) {
            System.out.println("c1对象打");
        }else if (compareValue<0){
            System.out.println("c2对象打");
        }else {
            System.out.println("一样大");
        }

    }
}
