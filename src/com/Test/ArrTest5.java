package com.Test;

public class ArrTest5 {
    public static void main(String[] args) {
        //定义一个数组：1，2，3，4，5，6，7，8，9，10,20
        //遍历数组得到每一个元素，统计能被3整除的个数
         int []arr={1,2,3,4,5,6,7,8,9,10,20};
         int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字有:"+count+"个");
    }
}
