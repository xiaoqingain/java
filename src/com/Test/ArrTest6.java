package com.Test;

public class ArrTest6 {
    public static void main(String[] args) {
        //定义一个数组：1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素
        /*要求
        1.如果数字是奇数扩大2倍
        2.如果数字是偶数变成二分之一
         */

        int []arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){

                arr[i]=arr[i]/2;

            }else {

                arr[i]=arr[i]*2;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
