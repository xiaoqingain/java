package com.Test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义一个数组12，13，23，45；
        //遍历数组并且求和
        int []arr={12,13,23,45};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组的和："+sum);
    }
}
