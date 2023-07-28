package com.Test;

public class ArrTest10 {
    public static void main(String[] args) {
        /*定义一个数组{1，2，3，4，5}
        要求交换数组{5，4，3，2，1}
         */
        int []arr={1,2,3,4,5};
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
