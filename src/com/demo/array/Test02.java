package com.demo.array;

public class Test02 {
    public static void main(String[] args) {
        /*定义一个数组，储存1，2，3，4，5，6，7，8，9，10
        遍历数组每一个元素
        如果是奇数扩大2倍
       如果是偶数/2倍*/


        //创建数组
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //创建
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (arr[i]%2!=0){
                sum=arr[i]*2;
                System.out.println("奇数扩大=；"+sum);
            }else {
                sum=arr[i]/2;
                System.out.println("偶数/2=；"+sum);
            }

        }
        //第二种方法
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0){
                arr1[i]=arr[i]*2;
            }else {
                arr1[i]=arr[i]/2;
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }


}
