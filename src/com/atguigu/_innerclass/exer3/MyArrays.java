package com.atguigu._innerclass.exer3;

/**
 * @author : Yac
 * @date : 2023/8/12
 */
public class MyArrays {
    public static void bubbleSort(Object[] arr,Comparator comparator){
        for (int i = 0; i < arr.length; i++) {
            for (int j= 0;  j< arr.length-1; j++) {
                if (comparator.sort(arr[j],arr[j+1])>0){
                    Object temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void iterate(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
