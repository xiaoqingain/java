package com.demo.array;

public class Test01 {
    public static void main(String[] args) {
        //定义一个数组，储存1，2，3，4，5，6，7，8，9，10
        //统计能被3整除的数组，并且他们遍历出来
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                System.out.println(arr[i]);
            }

        }
    }
}
