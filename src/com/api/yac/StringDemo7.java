package com.api.yac;

public class StringDemo7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        String str = arrString(arr);
        System.out.println(str);
    }

    public static String arrString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                result=result+arr[i];
            }else {
                result = result + arr[i]+",";
            }


        }
        result=result+"]";
        return result;
    }

}

