package com.demo.method;

public class Met {
    public static void main(String[] args) {


        System.out.println(add(3,5));
        System.out.println(add(3,2,5));
        System.out.println(add(3.1,5.6));
        System.out.println(add(3.1,5));
        System.out.println(add(3.1,5.6,5.5));

    }//方法名重载

    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static double add(double x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static double add(double x,double y,double z){
        return x+y+z;
    }
    public static double add(double x,double y,int z){
        return x+y+z;
    }
}
