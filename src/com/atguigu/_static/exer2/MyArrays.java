package com.atguigu._static.exer2;

/**
 * @author : Yac
 * @date : 2023/8/3
 */
public class MyArrays {
    /**
     * 获取int[]数组的最大值
     * @param arr 要求获取最大值的数组
     * @return 数组的最大值
     */
    public static int getMax(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
    /**
     * 获取int[]数组的最小值
     * @param arr 要求获取最小值的数组
     * @return 数组的最小值
     */
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int getAvg(int[] arr){
        return getSum(arr)/arr.length;
    }

    /**
     * 打印数组
     * @param arr
     */
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                System.out.print(arr[i]);
            }else {
                System.out.print(","+arr[i]);
            }
        }
        System.out.println("]");
    }
    public static int[] copy(int[] arr){
        int[] newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static void reverse(int[] arr){
      for (int i=0,j=arr.length-1;i<j;i++,j--){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;

      }
    }
    public static void sort(int[] arr){
        for (int j=0;j<arr.length-1;j++){
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                return i;
            }
        }
        //只要代码执行到此处位置，一定是没有找到。
        return -1;
    }

}
