package com.methodetest.yac;

public class Test4 {
    public static void main(String[] args) {
        /*
        要求定义一个方法用于数组遍历，要求遍历的结果是在同一行。例如：[11,22,33,44,55]
         */
        //定义一个数组
        int []arr={11,22,33,44,55};
        PrintArr(arr);

    }
    public static void PrintArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
           if (i== arr.length-1){
               System.out.print(arr[i]);
           }else {
               System.out.print(arr[i]+",");
           }
        }
        System.out.println("]");
    }
}
