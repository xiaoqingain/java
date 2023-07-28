package com.demo.CI;

public class Test {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=3){
            sum+=i;
            System.out.println(i);
            i++;
        }
        System.out.println("sum="+sum);
        System.out.println("i="+i);
    }
}
