package com.Test;

public class ArrTest8 {
    public static void main(String[] args) {
        //已知元素为{18，28，32，11，6，23}，求这个数组的最大值和会小值；
        int []arr={18,28,32,11,6,23,80,-10};
        int Max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            } else if (arr[i]>Max) {
                Max=arr[i];
            }
        }
        System.out.println(Max);
        System.out.println(min);
    }
}
