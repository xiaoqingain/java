package com.demo.array;

public class Test3 {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr={33,5,44,22};
        //临时认为0索引最大值
        //求最大值
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值为："+max);
            //求最小值
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];

            }
        }

        System.out.println("最小值为："+min);
    }
}
