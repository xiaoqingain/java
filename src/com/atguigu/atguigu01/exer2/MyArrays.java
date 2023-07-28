package com.atguigu.atguigu01.exer2;

/**
 * @author : Yac
 * @date : 2023/7/17
 * @effect : 当前类的作用是
 * @projectTeam :
 */
public class MyArrays {
    //求最大值
    public int gatMax(int []arr){
       int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //求最小值
    public int gatMin(int[]arr){
       int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    //求和
    public int  getSum(int []arr){
       int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //求平均值
    public int getAvg(int[] arr){
        return getSum(arr)/arr.length;

    }
    //遍历数组
    public void pint(int []arr){
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
    //复制数组
    public int[] copy(int []arr){
        int[] newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }

        return newArr;
    }
    //反正数组
    public void reverse(int []arr){
        for (int i = 0, j =arr.length-1;i<j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    //数组排序
    public void shoat(int []arr){
        for (int j=0;j<arr.length-1;j++){
            for (int i = 0; i < arr.length-1 -j; i++) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }
    //查找
    public int linearSearch(int[]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
