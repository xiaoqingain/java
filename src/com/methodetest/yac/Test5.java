package com.methodetest.yac;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：设计一个方法求最大值，并将最大值返回。
         */
        int []arr={12,25,45,17};
         int max=PrintArr(arr);
        System.out.println("数组中的最大值是："+max);
    }
    public static int PrintArr(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
               max =arr[i];
            }
        }
        return max;
    }
}
