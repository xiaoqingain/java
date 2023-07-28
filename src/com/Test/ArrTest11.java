package com.Test;

import java.util.Random;

/**
 * @author Ryan
 */
public class ArrTest11 {
    public static void main(String[] args) {
        /*定义一个数组{1，2，3，4，5}
        要求打乱数组中的数据
         */
        int []arr={1,2,3,4,5};
        Random r=new Random();



        for (int i = 0; i < arr.length; i++) {
            int j=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);
    }
}
