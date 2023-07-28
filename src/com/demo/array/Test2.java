package com.demo.array;

public class Test2 {
    public static void main(String[] args) {
        //创建一个数组
        int [] add={1,2,3,4,5};
        //遍历数组并求和
        int sum=0;
        for (int i = 0; i < add.length; i++) {
            sum=sum+add[i];

            System.out.println(add[i]);
        }
        System.out.println(sum);
    }
}
