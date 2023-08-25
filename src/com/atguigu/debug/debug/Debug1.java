package com.atguigu.debug.debug;

/**
 * @author : Yac
 * @date : 2023/8/17
 */
public class Debug1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a= "+a+", "+"b= "+b);
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println("a= "+a+", "+"b= "+b);

       ame(a,b);
        System.out.println("a= "+a+", "+"b= "+b);



    }
    public  static void ame(int n, int m){
        int mpe=n;
        n=m;
        m=mpe;
        System.out.println("a= "+n+", "+"b= "+m);


    }
}
