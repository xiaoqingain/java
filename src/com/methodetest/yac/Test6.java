package com.methodetest.yac;

public class Test6 {
    public static void main(String[] args) {
        /*
        要求：定义一个方法判断数组中的某一个数据是否存在，将结果放回给调用处。
         */
        int []arr={12,25,45,17};
        boolean flag=PrintArr(arr,22);
        System.out.println(flag);
    }
    public static boolean PrintArr(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
