package com.atguigu._static.exer2;

/**
 * @author : Yac
 * @date : 2023/8/3
 */
public class MyArraysTest {
    public static void main(String[] args) {
       

        int[]arr=new int[]{22,23,32,55,91,53,12,31,65};
        //求最大值
        System.out.println("最大值为："+MyArrays.getMax(arr));
        //求最小值
        System.out.println("最小值为："+MyArrays.getMin(arr));
        //求和
        System.out.println("和为："+MyArrays.getSum(arr));
        //求平均值
        System.out.println("平均值为："+MyArrays.getAvg(arr));
        //遍历数组
        MyArrays.print(arr);
        //查找
        int index=MyArrays.linearSearch(arr,24);
            if (index>=0){
                System.out.println("找到了，位置为："+index);
            }else {
                System.out.println("为找到");
            }

        MyArrays.reverse(arr);
        //排序
        MyArrays.sort(arr);
        //遍历数组
        MyArrays.print(arr);
    }
}
