package com.atguigu.atguigu01.exer2;

/**
 * @author : Yac
 * @date : 2023/7/17
 * @projectTeam :
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays arr1=new MyArrays();
        int[]arr={42,27,32,34,19,78,45,66};
        //求最大值
        System.out.println("最大值为；"+arr1.gatMax(arr));
        //求最小值
        System.out.println("最小值为；"+arr1.gatMin(arr));
        //求和
        System.out.println("求和为："+arr1.getSum(arr));
      //求平均值
        System.out.println("平均值为："+arr1.getAvg(arr));
        //遍历
        arr1.pint(arr);
        //查找
        int index =arr1.linearSearch(arr,34);
        if (index>=0){
            System.out.println("找到了，位置为："+index);
        }else {
            System.out.println("未找到");
        }
        //排序
        arr1.shoat(arr);
        arr1.pint(arr);

    }
}
